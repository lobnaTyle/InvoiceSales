package sig.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import sig.model.InvoiceHeader;
import sig.model.InvoiceLine;
import sig.model.InvoiceLineTableModel;
import sig.view.InvoiceFrame;

public class Controller implements ActionListener, ListSelectionListener {

    private InvoiceFrame frame;

    public Controller(InvoiceFrame frame) {
        this.frame = frame;
    }

    public Controller() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "Load File": {
                loadFiles();
            }
            break;
            case "Save File ":
                saveFiles();
                break;
            case "Create New Invoice":
                createNewInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "Create New Line":
                createNewLine();
                break;
            case "Delete Line":
                deleteLine();
                break;
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        System.out.println("Row Selected");
        int selectedRow = frame.getInvheaderTable().getSelectedRow();
        System.out.println(selectedRow);
        ArrayList<InvoiceLine> lines = frame.getInvoiceHeaderList().get(selectedRow).getLines();
        frame.getInvlineTable().setModel(new InvoiceLineTableModel(lines));
    }

    private void loadFiles() {
        try {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                String headerStrPath = headerFile.getAbsolutePath();
                Path headerPath = Paths.get(headerStrPath);
                List<String> headerLines = Files.lines(headerPath).collect(Collectors.toList());
                ArrayList<InvoiceHeader> invoiceHeaderList = new ArrayList();
                for (String headerLine : headerLines) {
                    String[] parts = headerLine.split(",");
                    int id = Integer.parseInt(parts[0]);
                    InvoiceHeader invHeader = new InvoiceHeader(id, parts[2], parts[1]);
                    invoiceHeaderList.add(invHeader);
                }
                System.out.println("check");
                result = fc.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String lineStrPath = fc.getSelectedFile().getAbsolutePath();
                    Path linePath = Paths.get(lineStrPath);
                    List<String> lineLines = Files.lines(linePath).collect(Collectors.toList());
                    for (String lineLine : lineLines) {
                        String[] parts = lineLine.split(",");
                        int invId = Integer.parseInt(parts[0]);
                        double price = Double.parseDouble(parts[2]);
                        int count = Integer.parseInt(parts[3]);
                        InvoiceHeader header = getInvoiceHeaderById(invoiceHeaderList, invId);
                        InvoiceLine invLine = new InvoiceLine(parts[1], price, count, header);
                        header.getLines().add(invLine);
                    }
                    frame.setInvoiceHeaderList(invoiceHeaderList);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private InvoiceHeader getInvoiceHeaderById(ArrayList<InvoiceHeader> invoices, int id) {
        for (InvoiceHeader invoice : invoices) {
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        return null;
    }

    private void saveFiles() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showSaveDialog(frame);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            String path = fc.getSelectedFile().getPath();
            FileOutputStream fes = null ;
            try {
                fes = new FileOutputStream(path);
                
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }    
    }

    private void createNewInvoice() {
        
    }

    private void deleteInvoice() {

    }

    private void createNewLine() {

    }

    private void deleteLine() {

    }

}
