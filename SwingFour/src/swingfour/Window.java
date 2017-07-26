package swingfour;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

// http://zetcode.com/tutorials/javaswingtutorial/
public class Window extends JFrame {
    Container container;
    GroupLayout grpLayout;
    
    JMenuBar menuMain;
    
    JPanel panelEnd;
    JButton btnExit;
    
    
    public Window() {
        initField();
        configField();
        configLayout();
        createMenu();
        
        actionField();
        
        
        this.setVisible(true);
    }
    public void initField() {        
                        
        this.setTitle("Window Title");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);   // Centrar 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnExit = new JButton("Exit");
        
        
    }
    
    
    public void configField() {
        btnExit.setToolTipText("Haga Click para Salir");
        btnExit.setMnemonic(KeyEvent.VK_E);
        //panelEnd.add(btnExit);
        //this.add(panelEnd, BorderLayout.PAGE_END);
        
        //this.setJMenuBar(null);
        
    }
    public void configLayout() {
        container = this.getContentPane();
        GroupLayout grpLayout = new GroupLayout(container);
        container.setLayout(grpLayout);
        
        grpLayout.setAutoCreateGaps(true);
        grpLayout.setAutoCreateContainerGaps(true);
        
        grpLayout.setHorizontalGroup(grpLayout.createSequentialGroup()
                .addComponent(btnExit));
        
        grpLayout.setVerticalGroup(grpLayout.createSequentialGroup()
                .addComponent(btnExit));
        
        /*container = this.getContentPane();
        grpLayout = new GroupLayout(container);        
        container.setLayout(grpLayout);
        
        grpLayout.setAutoCreateGaps(true);
        grpLayout.setAutoCreateContainerGaps(true);
        
        grpLayout.setHorizontalGroup( grpLayout.createSequentialGroup()
            .addComponent(btnExit));
        grpLayout.setVerticalGroup(grpLayout.createSequentialGroup()
            .addComponent(btnExit));*/
                
    }
    
    public void createMenu() {
        ImageIcon iconNew = new ImageIcon(this.getClass().getResource("/image/new.png"));
        ImageIcon iconOpen = new ImageIcon(this.getClass().getResource("/image/open.png"));
        ImageIcon iconSave = new ImageIcon(this.getClass().getResource("/image/save.png"));
        ImageIcon iconExit = new ImageIcon(this.getClass().getResource("/image/exit.png"));
                
        menuMain = new JMenuBar();
        
        JMenu archivoMenu = new JMenu("Archivo");
        archivoMenu.setMnemonic(KeyEvent.VK_A);
        
        JMenuItem itemNew = new JMenuItem("Nuevo", iconNew);
        itemNew.setMnemonic(KeyEvent.VK_N);
        itemNew.setToolTipText("Nuevo archivo");
        itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        JMenuItem itemOpen = new JMenuItem("Open", iconOpen);
        itemOpen.setMnemonic(KeyEvent.VK_O);
        itemOpen.setToolTipText("Abriendo archivo");
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        
        JMenuItem itemSave = new JMenuItem("Gravar", iconSave);
        itemSave.setMnemonic(KeyEvent.VK_G);
        itemSave.setToolTipText("Gravar archivo");
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        
        JMenuItem itemExit = new JMenuItem("Salir", iconExit);
        itemExit.setMnemonic(KeyEvent.VK_S);
        itemExit.setToolTipText("Salir del Sistema");
        itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        
        archivoMenu.add(itemNew);
        archivoMenu.add(itemOpen);
        archivoMenu.add(itemSave);
        archivoMenu.add(itemExit);
        
        menuMain.add(archivoMenu);
        
        this.setJMenuBar(menuMain);
    }
    public void actionField() {
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    
}
