package jnotepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import javax.swing.GroupLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;
import say.swing.JFontChooser;

public class FrameNotepad extends JFrame {

    private String path;

    private Boolean isModified = Boolean.valueOf(false);

    private String absolutePath;

    public FrameNotepad() {
        initComponents();
        setTitle("Senza Titolo - JNotepad by Aloigi Cristiano");
        this.atxTesto.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jMenuItem1 = new JMenuItem();
    this.jScrollPane1 = new JScrollPane();
    this.atxTesto = new JTextArea();
    this.jMenuBar1 = new JMenuBar();
    this.jMenu1 = new JMenu();
    this.New = new JMenuItem();
    this.Open = new JMenuItem();
    this.Save = new JMenuItem();
    this.SaveAs = new JMenuItem();
    this.Exit = new JMenuItem();
    this.jMenu3 = new JMenu();
    this.TimeDate = new JMenuItem();
    this.jMenu4 = new JMenu();
    this.Typeface = new JMenuItem();
    this.jMenu2 = new JMenu();
    this.About = new JMenuItem();
    this.jMenuItem1.setText("jMenuItem1");
    setDefaultCloseOperation(3);
    addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent evt) {
            FrameNotepad.this.formWindowClosing(evt);
          }
        });
    this.atxTesto.setColumns(20);
    this.atxTesto.setRows(5);
    this.atxTesto.addInputMethodListener(new InputMethodListener() {
          public void caretPositionChanged(InputMethodEvent evt) {}
          
          public void inputMethodTextChanged(InputMethodEvent evt) {
            FrameNotepad.this.atxTestoInputMethodTextChanged(evt);
          }
        });
    this.atxTesto.addKeyListener(new KeyAdapter() {
          public void keyPressed(KeyEvent evt) {
            FrameNotepad.this.atxTestoKeyPressed(evt);
          }
        });
    this.jScrollPane1.setViewportView(this.atxTesto);
    this.jMenu1.setText("File");
    this.New.setAccelerator(KeyStroke.getKeyStroke(78, 2));
    this.New.setText("New");
    this.New.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameNotepad.this.NewActionPerformed(evt);
          }
        });
    this.jMenu1.add(this.New);
    this.Open.setAccelerator(KeyStroke.getKeyStroke(79, 2));
    this.Open.setText("Open");
    this.Open.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameNotepad.this.OpenActionPerformed(evt);
          }
        });
    this.jMenu1.add(this.Open);
    this.Save.setAccelerator(KeyStroke.getKeyStroke(83, 2));
    this.Save.setText("Save");
    this.Save.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameNotepad.this.SaveActionPerformed(evt);
          }
        });
    this.jMenu1.add(this.Save);
    this.SaveAs.setText("Save As");
    this.SaveAs.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameNotepad.this.SaveAsActionPerformed(evt);
          }
        });
    this.jMenu1.add(this.SaveAs);
    this.Exit.setAccelerator(KeyStroke.getKeyStroke(81, 2));
    this.Exit.setText("Exit");
    this.Exit.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameNotepad.this.ExitActionPerformed(evt);
          }
        });
    this.jMenu1.add(this.Exit);
    this.jMenuBar1.add(this.jMenu1);
    this.jMenu3.setText("Edit");
    this.TimeDate.setAccelerator(KeyStroke.getKeyStroke(116, 0));
    this.TimeDate.setText("Time/Date");
    this.TimeDate.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameNotepad.this.TimeDateActionPerformed(evt);
          }
        });
    this.jMenu3.add(this.TimeDate);
    this.jMenuBar1.add(this.jMenu3);
    this.jMenu4.setText("Format");
    this.Typeface.setText("Typeface");
    this.Typeface.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameNotepad.this.TypefaceActionPerformed(evt);
          }
        });
    this.jMenu4.add(this.Typeface);
    this.jMenuBar1.add(this.jMenu4);
    this.jMenu2.setText("Help");
    this.About.setText("About");
    this.About.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameNotepad.this.AboutActionPerformed(evt);
          }
        });
    this.jMenu2.add(this.About);
    this.jMenuBar1.add(this.jMenu2);
    setJMenuBar(this.jMenuBar1);
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(this.jScrollPane1, -1, 599, 32767));
    layout.setVerticalGroup(layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(this.jScrollPane1, -1, 412, 32767));
    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewActionPerformed(ActionEvent evt) {
        this.path = new String();
        this.atxTesto.setText("");
        this.isModified = Boolean.valueOf(false);
    }

    private void AboutActionPerformed(ActionEvent evt) {
        FrameAbout frm = new FrameAbout();
        frm.setVisible(true);
    }

    private void OpenActionPerformed(ActionEvent evt) {
        this.atxTesto.setText("");
        this.isModified = Boolean.valueOf(false);
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new FileFilter() {
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                return f.getName().toLowerCase().endsWith(".txt");
            }

            public String getDescription() {
                return "Text Documents (*.txt)";
            }
        });
        try {
            if (fc.showOpenDialog(this) == 0) {
                FileReader fr = null;
                BufferedReader br = null;
                try {
                    fr = new FileReader(fc.getSelectedFile());
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Il file ricercato non esiste");
                }
                try {
                    this.path = fc.getName(fc.getSelectedFile());
                    this.absolutePath = fc.getSelectedFile().getPath();
                    setTitle(this.path + " - JNotepad by Aloigi Cristiano");
                    br = new BufferedReader(fr);
                    String lettura = null;
                    lettura = br.readLine();
                    while (lettura != null) {
                        System.out.println("Stringa letta da file: " + lettura);
                        this.atxTesto.append(lettura + "\n");
                        lettura = br.readLine();
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Problemi nella lettura del file");
                } finally {
                    try {
                        fr.close();
                        br.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Problemi nella chiusura del file di testo");
                    }
                }
            }
        } finally {
            fc.setVisible(false);
        }
    }

    private void ExitActionPerformed(ActionEvent evt) {
        if (getTitle().contains("*")) {
            int conferma = JOptionPane.showConfirmDialog(null, "Do you want to save this file?", "Confirm Exit", 0);
            if (conferma == 0) {
                SaveAs();
                dispose();
            } else {
                System.exit(0);
            }
        }
    }

    private void SaveActionPerformed(ActionEvent evt) {
        this.isModified = Boolean.valueOf(false);
        if (this.path == null || this.path.equals("")) {
            JFileChooser fc = new JFileChooser();
            fc.addChoosableFileFilter(new FileFilter() {
                public boolean accept(File f) {
                    if (f.isDirectory()) {
                        return true;
                    }
                    return f.getName().toLowerCase().endsWith(".txt");
                }

                public String getDescription() {
                    return "Text Documents (*.txt)";
                }
            });
            try {
                this.path = fc.getSelectedFile().getName();
                this.absolutePath = fc.getSelectedFile().getPath() + ".txt";
                if (fc.showSaveDialog(this) == 0) {
                    FileWriter fw = null;
                    PrintWriter pw = null;
                    try {
                        fw = new FileWriter(this.absolutePath, true);
                        pw = new PrintWriter(fw);
                        String testo = this.atxTesto.getText();
                        pw.println(testo);
                        pw.flush();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Problemi nella scrittura del file di testo");
                    }
                }
            } finally {
                fc.setVisible(true);
                setTitle(this.path + " - JNotepad by Aloigi Cristiano");
            }
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter(this.absolutePath, false);
                pw = new PrintWriter(fw);
                String testo = this.atxTesto.getText();
                pw.println(testo);
                pw.flush();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Problemi nella scrittura del file di testo");
            } finally {
                try {
                    pw.close();
                    fw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Problemi nella chiusura del file di testo");
                }
                setTitle(this.path + " - JNotepad by Aloigi Cristiano");
            }
        }
    }

    private void SaveAsActionPerformed(ActionEvent evt) {
        this.isModified = Boolean.valueOf(false);
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new FileFilter() {
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                return f.getName().toLowerCase().endsWith(".txt");
            }

            public String getDescription() {
                return "Text Documents (*.txt)";
            }
        });
        try {
            if (fc.showSaveDialog(this) == 0) {
                FileWriter fw = null;
                PrintWriter pw = null;
                try {
                    fw = new FileWriter(new File(fc.getSelectedFile().getAbsolutePath() + ".txt"), true);
                    this.path = fc.getSelectedFile().getName();
                    this.absolutePath = fc.getSelectedFile().getPath() + ".txt";
                    pw = new PrintWriter(fw);
                    String testo = this.atxTesto.getText();
                    pw.println(testo);
                    pw.flush();
                    pw.close();
                    fw.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Problemi nella scrittura del file di testo");
                }
            }
        } finally {
            fc.setVisible(true);
            setTitle(this.path + " - JNotepad by Aloigi Cristiano");
        }
    }

    private void TimeDateActionPerformed(ActionEvent evt) {
        this.atxTesto.setText("");
        GregorianCalendar dataAttuale = new GregorianCalendar();
        Integer anno = Integer.valueOf(dataAttuale.get(1));
        Integer mese = Integer.valueOf(dataAttuale.get(2) + 1);
        Integer giorno = Integer.valueOf(dataAttuale.get(5));
        Integer ore = Integer.valueOf(dataAttuale.get(11));
        Integer minuti = Integer.valueOf(dataAttuale.get(12));
        this.atxTesto.append(ore.toString() + ":" + minuti.toString() + " " + giorno + "/" + mese + "/" + anno);
    }

    private void atxTestoInputMethodTextChanged(InputMethodEvent evt) {
    }

    private void atxTestoKeyPressed(KeyEvent evt) {
        this.isModified = Boolean.valueOf(true);
        if (this.path == null) {
            setTitle("Senza Titolo* - JNotepad By Aloigi Cristiano");
        } else {
            setTitle(this.path + "* - JNotepad By Aloigi Cristiano");
        }
    }

    private void TypefaceActionPerformed(ActionEvent evt) {
        JFontChooser fc = new JFontChooser();
        fc.showDialog(this);
        this.atxTesto.setFont(fc.getSelectedFont());
    }

    private void formWindowClosing(WindowEvent evt) {
        if (getTitle().contains("*")) {
            setDefaultCloseOperation(0);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    int conferma = JOptionPane.showConfirmDialog(null, "Do you want to save this file?", "Confirm Exit", 0);
                    if (conferma == 0) {
                        FrameNotepad.this.SaveAs();
                        FrameNotepad.this.dispose();
                    } else {
                        System.exit(0);
                    }
                }
            });
        }
    }

    public void SaveAs() {
        this.isModified = Boolean.valueOf(false);
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new FileFilter() {
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                return f.getName().toLowerCase().endsWith(".txt");
            }

            public String getDescription() {
                return "Text Documents (*.txt)";
            }
        });
        try {
            if (fc.showSaveDialog(this) == 0) {
                FileWriter fw = null;
                PrintWriter pw = null;
                try {
                    fw = new FileWriter(new File(fc.getSelectedFile().getAbsolutePath() + ".txt"), true);
                    this.path = fc.getSelectedFile().getName();
                    this.absolutePath = fc.getSelectedFile().getPath() + ".txt";
                    pw = new PrintWriter(fw);
                    String testo = this.atxTesto.getText();
                    pw.println(testo);
                    pw.flush();
                    pw.close();
                    fw.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Problemi nella scrittura del file di testo");
                }
            }
        } finally {
            fc.setVisible(true);
            setTitle(this.path + " - JNotepad by Aloigi Cristiano");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private JMenuItem About;

    private JMenuItem Exit;

    private JMenuItem New;

    private JMenuItem Open;

    private JMenuItem Save;

    private JMenuItem SaveAs;

    private JMenuItem TimeDate;

    private JMenuItem Typeface;

    private JTextArea atxTesto;

    private JMenu jMenu1;

    private JMenu jMenu2;

    private JMenu jMenu3;

    private JMenu jMenu4;

    private JMenuBar jMenuBar1;

    private JMenuItem jMenuItem1;

    private JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
