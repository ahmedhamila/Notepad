import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
public class Frame extends JFrame{
    public Frame()
    {
        super();
        this.setSize(350, 350);
        this.setVisible(true);

        JMenuBar menubar=new JMenuBar();
        JMenu File=new JMenu("File");
            JMenuItem New=new JMenuItem("New");
                KeyStroke ctrlN = KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                New.setAccelerator(ctrlN);
            JMenuItem Open=new JMenuItem("Open");
                KeyStroke ctrlO = KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Open.setAccelerator(ctrlO);
            JMenuItem Save=new JMenuItem("Save");
                KeyStroke ctrlS = KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Save.setAccelerator(ctrlS);
            JMenuItem SaveAs=new JMenuItem("SaveAs");
            JMenuItem PageSetup=new JMenuItem("PageSetup");
            JMenuItem Print=new JMenuItem("Print");
                KeyStroke ctrlP = KeyStroke.getKeyStroke(KeyEvent.VK_P, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Print.setAccelerator(ctrlP);
            JMenuItem Exit=new JMenuItem("Exit");
            File.add(New);
            File.add(Open);
            File.add(Save);
            File.add(SaveAs);
            File.addSeparator();
            File.add(PageSetup);
            File.add(Print);
            File.addSeparator();
            File.add(Exit);
        JMenu Edit=new JMenu("Edit");
            JMenuItem Undo=new JMenuItem("Undo");
                KeyStroke ctrlZ = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Undo.setAccelerator(ctrlZ);
            JMenuItem Cut=new JMenuItem("Cut");
                KeyStroke ctrlX = KeyStroke.getKeyStroke(KeyEvent.VK_X, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Cut.setAccelerator(ctrlX);
            JMenuItem Copy=new JMenuItem("Copy");
                KeyStroke ctrlC = KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Copy.setAccelerator(ctrlC);
            JMenuItem Paste=new JMenuItem("Paste");
                KeyStroke ctrlV = KeyStroke.getKeyStroke(KeyEvent.VK_V, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Paste.setAccelerator(ctrlV);
            JMenuItem Delete=new JMenuItem("Delete");
                KeyStroke del = KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0);
                Delete.setAccelerator(del);
            JMenuItem Find=new JMenuItem("Find");
                KeyStroke ctrlF = KeyStroke.getKeyStroke(KeyEvent.VK_F, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Find.setAccelerator(ctrlF);
            JMenuItem FindNext=new JMenuItem("Find Next");
                KeyStroke f3 = KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0);
                FindNext.setAccelerator(f3);
            JMenuItem Replace=new JMenuItem("Replace");
                KeyStroke ctrlH = KeyStroke.getKeyStroke(KeyEvent.VK_H, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                Replace.setAccelerator(ctrlH);
            JMenuItem GoTo=new JMenuItem("Go To");
                KeyStroke ctrlG = KeyStroke.getKeyStroke(KeyEvent.VK_G, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                GoTo.setAccelerator(ctrlG);
            JMenuItem SelectAll=new JMenuItem("Select All");
                KeyStroke ctrlA = KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx());
                SelectAll.setAccelerator(ctrlA);
            JMenuItem TimeDate=new JMenuItem("Time/Date");
                KeyStroke f5 = KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0);
                TimeDate.setAccelerator(f5);
            Edit.add(Undo);
            Edit.addSeparator();
            Edit.add(Cut);
            Edit.add(Copy);
            Edit.add(Paste);
            Edit.add(Delete);
            Edit.addSeparator();
            Edit.add(Find);
            Edit.add(FindNext);
            Edit.add(Replace);
            Edit.add(GoTo);
            Edit.addSeparator();
            Edit.add(SelectAll);
            Edit.add(TimeDate);
        JMenu Format=new JMenu("Format");
            JMenuItem WordWrap=new JMenuItem("Undo");
            JMenuItem Font=new JMenuItem("Font");
            JMenuItem SetTextColor=new JMenuItem("Set Text Color");
            JMenuItem SetPadColor=new JMenuItem("Set Pad Color");
            Format.add(WordWrap);
            Format.add(Font);
            Format.addSeparator();
            Format.add(SetTextColor);
            Format.add(SetPadColor);
        JMenu View=new JMenu("View");
            JCheckBoxMenuItem StatusBar = new JCheckBoxMenuItem("Status Bar", true);
            JMenuItem ChangeLookAndFeel =new JMenuItem("Change Look And Feel");
            View.add(StatusBar);
            View.add(ChangeLookAndFeel);
        JMenu Help=new JMenu("Help");
            JMenuItem HelpTopic=new JMenuItem("Help Topic");
            JMenuItem About=new JMenuItem("About");
            Help.add(HelpTopic);
            Help.addSeparator();
            Help.add(About);

        menubar.add(File);
        menubar.add(Edit);
        menubar.add(Format);
        menubar.add(View);
        menubar.add(Help);

        menubar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menubar.setSize(menubar.getWidth(), 100);
        
        this.setJMenuBar(menubar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea area=new JTextArea();
        area.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(area);
        
        this.getContentPane().add(scrollPane);
        
    }
}
