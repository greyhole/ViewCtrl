

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Timer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nvetter
 */
public class NewJFrame extends javax.swing.JFrame {
    private boolean x,status;
    private static Socket socket;
    private static ObjectOutputStream oout;
    private static int port;
    private static String ip;
    private static DefaultTableModel fList,mList,lineupModel;
    private GraphicsDevice device;
    
    /**
    * Creates new form NewJFrame
     */
    public NewJFrame(boolean x) {
        Task task=new Task(this);
        Timer timer=new Timer();
        this.x=x;
        initComponents();
        this.status=true;
        timer.schedule(task, 1000, 7000);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        if (x==true){
            this.setUndecorated(true);

        }
        jPopupMenu1 = new javax.swing.JPopupMenu();
        fullscreenMenuItem = new javax.swing.JMenuItem();
        windowMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        einstellungenMenuItem = new javax.swing.JMenuItem();
        connectMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rundenTabelle = new javax.swing.JTable();
        bezeichnungLabel = new javax.swing.JLabel();
        roundplusBtn = new javax.swing.JButton();
        roundminusBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ergebnisTabelle = new javax.swing.JTable();

        windowMenuItem = new JMenuItem("A popup menu item");
        jPopupMenu1.add(windowMenuItem);

        fullscreenMenuItem.setText("Vollbild");
        fullscreenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullscreenMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(fullscreenMenuItem);

        windowMenuItem.setText("Fenster");
        windowMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(windowMenuItem);
        jPopupMenu1.add(jSeparator1);

        einstellungenMenuItem.setText("Einstellungen");
        einstellungenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                einstellungenMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(einstellungenMenuItem);

        connectMenuItem.setText("Verbinden");
        connectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(connectMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MouseListener popupListener = new PopupListener();
        jPanel1.addMouseListener(popupListener);
        jPanel1.setBackground(new java.awt.Color(1, 74, 1));

        rundenTabelle.setBackground(new java.awt.Color(1, 74, 1));
        rundenTabelle.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        rundenTabelle.setForeground(new java.awt.Color(254, 254, 254));
        lineupModel=new DefaultTableModel(initVector(1),initVector(0));
        rundenTabelle.setModel(lineupModel);
        rundenTabelle.setAutoscrolls(false);
        rundenTabelle.setFillsViewportHeight(true);
        rundenTabelle.getColumnModel().getColumn(1).setMaxWidth(200);
        rundenTabelle.getColumnModel().getColumn(1).setMaxWidth(200);
        rundenTabelle.getTableHeader().setReorderingAllowed(false);
        rundenTabelle.getTableHeader().setFont(new java.awt.Font("Cantarell", 1, 24));
        rundenTabelle.getTableHeader().setForeground(new java.awt.Color(254, 254, 254));
        rundenTabelle.getTableHeader().setBackground(new java.awt.Color(1, 74, 1));
        rundenTabelle.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                rundenTabelleComponentResized(evt);
            }
        });
        jScrollPane1.setViewportView(rundenTabelle);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );

        bezeichnungLabel.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        bezeichnungLabel.setForeground(new java.awt.Color(254, 254, 254));
        bezeichnungLabel.setText("Herren:");

        roundplusBtn.setText("Runde Plus");
        roundplusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundplusBtnActionPerformed(evt);
            }
        });

        roundminusBtn.setText("Runde Minus");
        roundminusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundminusBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(1, 74, 1));

        ergebnisTabelle.setBackground(new java.awt.Color(1, 74, 1));
        ergebnisTabelle.getTableHeader().setBackground(new java.awt.Color(1, 74, 1));
        ergebnisTabelle.setFont(ergebnisTabelle.getFont().deriveFont(ergebnisTabelle.getFont().getStyle() | java.awt.Font.BOLD, ergebnisTabelle.getFont().getSize()+21));
        ergebnisTabelle.setForeground(new java.awt.Color(254, 254, 254));
        mList=new javax.swing.table.DefaultTableModel(initVector(3),initVector(2)
        );
        fList=new javax.swing.table.DefaultTableModel(initVector(3),initVector(2)
        );
        ergebnisTabelle.setModel(mList);
        ergebnisTabelle.setFillsViewportHeight(true);
        ergebnisTabelle.setRowSelectionAllowed(false);
        ergebnisTabelle.getTableHeader().setFont(new java.awt.Font("Cantarell", 1, 24));
        ergebnisTabelle.getTableHeader().setForeground(new java.awt.Color(254, 254, 254));
        ergebnisTabelle.getTableHeader().setBackground(new java.awt.Color(1, 74, 1));
        ergebnisTabelle.setSelectionBackground(new java.awt.Color(1, 74, 1));
        ergebnisTabelle.setSelectionForeground(new java.awt.Color(1, 74, 1));
        ergebnisTabelle.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ergebnisTabelleComponentResized(evt);
            }
        });
        jScrollPane2.setViewportView(ergebnisTabelle);
        ergebnisTabelle.getColumnModel().getColumn(0).setResizable(false);
        ergebnisTabelle.getColumnModel().getColumn(0).setPreferredWidth(20);
        ergebnisTabelle.getColumnModel().getColumn(1).setResizable(false);
        ergebnisTabelle.getColumnModel().getColumn(2).setResizable(false);
        ergebnisTabelle.getColumnModel().getColumn(3).setResizable(false);
        ergebnisTabelle.getColumnModel().getColumn(4).setResizable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bezeichnungLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(roundplusBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roundminusBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundminusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundplusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(bezeichnungLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullscreenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullscreenMenuItemActionPerformed
        this.setVisible(false);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	device =ge.getDefaultScreenDevice();
        NewJFrame gui=new NewJFrame(true);
        gui.setVisible(true);
    	device.setFullScreenWindow(gui);        
    }//GEN-LAST:event_fullscreenMenuItemActionPerformed

    private void windowMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowMenuItemActionPerformed
       this.setVisible(false);
       NewJFrame gui=new NewJFrame(false);
       gui.setVisible(true);   
    }//GEN-LAST:event_windowMenuItemActionPerformed

    private void einstellungenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_einstellungenMenuItemActionPerformed
        SettingsPanel panel=new SettingsPanel();
        panel.setIP(ip);
        panel.setPort(port);
        int a=JOptionPane.showConfirmDialog(this,panel,"Put username and password",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (a==JOptionPane.OK_OPTION){
            ip=panel.getIP();
            port=panel.getPort();
        }
    }//GEN-LAST:event_einstellungenMenuItemActionPerformed

    private void connectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectMenuItemActionPerformed
       try{
           socket = new Socket (ip,port);
           System.out.println("Connectet");
           oout=new ObjectOutputStream(socket.getOutputStream());
           new ClientThread(this,socket);
           
       }catch(IOException ie){System.out.println(ie);}
    }//GEN-LAST:event_connectMenuItemActionPerformed

    private void ergebnisTabelleComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ergebnisTabelleComponentResized
       int compHeight = ergebnisTabelle.getSize().height;
       int compWidth = ergebnisTabelle.getSize().width;
       ergebnisTabelle.setRowHeight((int)compHeight/10);
       //ergebnisTabelle.setPreferredSize(new Dimension(compWidth,compHeight));
    }//GEN-LAST:event_ergebnisTabelleComponentResized

    private void rundenTabelleComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_rundenTabelleComponentResized
        int compHeight = rundenTabelle.getSize().height;
        int compWidth = rundenTabelle.getSize().width;
        rundenTabelle.setRowHeight((int)compHeight/3);
        //rundenTabelle.setPreferredSize(new Dimension(compWidth,compHeight));
    }//GEN-LAST:event_rundenTabelleComponentResized

    private void roundplusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundplusBtnActionPerformed
        ArrayList<Integer> tmp=new ArrayList<Integer>(2);
        tmp.add((int)0);
    	this.broadcast(tmp);
    }//GEN-LAST:event_roundplusBtnActionPerformed

    private void roundminusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundminusBtnActionPerformed
    	ArrayList<Integer> tmp=new ArrayList<Integer>(2);
        tmp.add((int)1);
    	this.broadcast(tmp);
    }//GEN-LAST:event_roundminusBtnActionPerformed

        
    
    public void broadcast(ArrayList send){
            try {
                oout.writeObject(send);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    public void setLineUp(DefaultTableModel rec){
        rundenTabelle.setModel(rec);
        rundenTabelle.getColumnModel().getColumn(1).setMaxWidth(90);
        rundenTabelle.getColumnModel().getColumn(1).setMaxWidth(200);
    }
    private Vector initVector(int x){
        Vector tmp=new Vector();
        if (x==0){
            tmp.add("");
            tmp.add("Runde");
            tmp.add("Bahn1");
            tmp.add("Bahn2");
            tmp.add("Bahn3");
            tmp.add("Bahn4");            
            return tmp;
        }
        else if (x==1){
           for (int j=0;j<3;j++){
            Vector m=new Vector();
            for (int i=0;i<6;i++){
                m.add("test");
            }
            tmp.add(m);
           }
           return tmp;
        }
        else if (x==2){
            tmp.add("Platz");
            tmp.add("Name");
            tmp.add("Schuss 1");
            tmp.add("Schuss 2");
            tmp.add("Schuss 3");
            tmp.add("Summe");
            return tmp;
        }
        else {
            for (int j=0;j<10;j++){
            Vector m=new Vector();
            for (int i=0;i<6;i++){
                m.add("");
            }
            tmp.add(m);
           }
           return tmp;
        }
    }
    
    public void setErg(DefaultTableModel rec1,DefaultTableModel rec2){
        synchronized(mList){
            this.mList=rec1;
        }
        synchronized(fList){
            this.fList=rec2;
        }
    }
    
    class PopupListener extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
        maybeShowPopup(e);
    }

    public void mouseReleased(MouseEvent e) {
        maybeShowPopup(e);
    }

    private void maybeShowPopup(MouseEvent e) {
        if (e.isPopupTrigger()) {
            jPopupMenu1.show(e.getComponent(),
                       e.getX(), e.getY());
        }
    }
    }
    public void updateErg(){
        if (status==false){
            bezeichnungLabel.setText("Herren:");
            ergebnisTabelle.setModel(mList);
            status=true;
            ergebnisTabelle.getColumnModel().getColumn(0).setMaxWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(2).setMaxWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(3).setMaxWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(4).setMaxWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(0).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(2).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(3).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(4).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(5).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(5).setMaxWidth(125);
        }
        else{
            bezeichnungLabel.setText("Damen:");
            ergebnisTabelle.setModel(fList);
            status=false;
            ergebnisTabelle.getColumnModel().getColumn(0).setMaxWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(2).setMaxWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(3).setMaxWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(4).setMaxWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(0).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(2).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(3).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(4).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(5).setMinWidth(125);
            ergebnisTabelle.getColumnModel().getColumn(5).setMaxWidth(125);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bezeichnungLabel;
    private javax.swing.JMenuItem connectMenuItem;
    private javax.swing.JMenuItem einstellungenMenuItem;
    private javax.swing.JTable ergebnisTabelle;
    private javax.swing.JMenuItem fullscreenMenuItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton roundminusBtn;
    private javax.swing.JButton roundplusBtn;
    private javax.swing.JTable rundenTabelle;
    private javax.swing.JMenuItem windowMenuItem;
    // End of variables declaration//GEN-END:variables
}