	package dictionary1;

	import java.util.ArrayList;
	import javax.swing.DefaultListModel;
	import javax.swing.JOptionPane;
	import com.sun.speech.freetts.*;
	import java.util.Collections;

	public class MainFrame extends javax.swing.JFrame {
	    ReadData data = new ReadData();
	    Searcher search = new Searcher();
	    Recent recent = new Recent();
	    ModifyDic modify = new ModifyDic();
	    ModifyFrame mf;
	    
	    DefaultListModel modelRecent ;
	    DefaultListModel model ;
	    String showWord;
	    int showingContent = 0, whatToDo = 0;
	    ArrayList recentList = recent.readIn();
	  
	    public MainFrame() {
	        initComponents();
	        inItData();
	    }
	    
	    private void inItData(){

	        model = new DefaultListModel();
	        ArrayList list = data.getList();
	        
	        for(int i=0; i<list.size(); i++){
	            model.addElement(list.get(i));
	        }
	        jList.setModel(model);
	    }
	    private void suggestionUpdate(){
	        ArrayList list ;
	        if(jSearch.getText()==null){
	            list = new ArrayList(data.list);
	        }
	        else list = search.searchResult(jSearch.getText(), data.list);
	        //Collections.sort(list);
	        if(list.size()>=2)
	            Collections.sort(list.subList(1, list.size()));
	                
	        model = new DefaultListModel();
	        for(int i=0; i<list.size(); i++){
	            model.addElement(list.get(i));
	        }
	        jList.setModel(model);
	    }


	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        jMenuBar2 = new javax.swing.JMenuBar();
	        jMenu3 = new javax.swing.JMenu();
	        jMenu4 = new javax.swing.JMenu();
	        jFrame1 = new javax.swing.JFrame();
	        jFrame2 = new javax.swing.JFrame();
	        jFrame3 = new javax.swing.JFrame();
	        jFrame4 = new javax.swing.JFrame();
	        jFrame5 = new javax.swing.JFrame();
	        jFrame6 = new javax.swing.JFrame();
	        jSearch = new javax.swing.JTextField();
	        btSuggest = new javax.swing.JButton();
	        btRecent = new javax.swing.JButton();
	        btTexttoSpeech = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();
	        jScrollPane3 = new javax.swing.JScrollPane();
	        jList = new javax.swing.JList<>();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        meaningsArea = new javax.swing.JEditorPane();
	        meaningsArea.setContentType("text/html");
	        //meaningsArea.setText(data.getMeanings().get(wordIndex).toString());
	        jRemove = new javax.swing.JButton();
	        btNewWord = new javax.swing.JButton();
	        btEditWord = new javax.swing.JButton();

	        jMenu3.setText("File");
	        jMenuBar2.add(jMenu3);

	        jMenu4.setText("Edit");
	        jMenuBar2.add(jMenu4);

	        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
	        jFrame1.getContentPane().setLayout(jFrame1Layout);
	        jFrame1Layout.setHorizontalGroup(
	            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 400, Short.MAX_VALUE)
	        );
	        jFrame1Layout.setVerticalGroup(
	            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 300, Short.MAX_VALUE)
	        );

	        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
	        jFrame2.getContentPane().setLayout(jFrame2Layout);
	        jFrame2Layout.setHorizontalGroup(
	            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 400, Short.MAX_VALUE)
	        );
	        jFrame2Layout.setVerticalGroup(
	            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 300, Short.MAX_VALUE)
	        );

	        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
	        jFrame3.getContentPane().setLayout(jFrame3Layout);
	        jFrame3Layout.setHorizontalGroup(
	            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 400, Short.MAX_VALUE)
	        );
	        jFrame3Layout.setVerticalGroup(
	            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 300, Short.MAX_VALUE)
	        );

	        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
	        jFrame4.getContentPane().setLayout(jFrame4Layout);
	        jFrame4Layout.setHorizontalGroup(
	            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 400, Short.MAX_VALUE)
	        );
	        jFrame4Layout.setVerticalGroup(
	            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 300, Short.MAX_VALUE)
	        );

	        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
	        jFrame5.getContentPane().setLayout(jFrame5Layout);
	        jFrame5Layout.setHorizontalGroup(
	            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 400, Short.MAX_VALUE)
	        );
	        jFrame5Layout.setVerticalGroup(
	            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 300, Short.MAX_VALUE)
	        );

	        jFrame6.setTitle("h");
	        jFrame6.setAlwaysOnTop(true);

	        javax.swing.GroupLayout jFrame6Layout = new javax.swing.GroupLayout(jFrame6.getContentPane());
	        jFrame6.getContentPane().setLayout(jFrame6Layout);
	        jFrame6Layout.setHorizontalGroup(
	            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 400, Short.MAX_VALUE)
	        );
	        jFrame6Layout.setVerticalGroup(
	            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 300, Short.MAX_VALUE)
	        );

	        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
	        setTitle("Dic");
	        setBounds(new java.awt.Rectangle(300, 120, 0, 0));
	        setResizable(false);
	        addWindowListener(new java.awt.event.WindowAdapter() {
	            public void windowClosing(java.awt.event.WindowEvent evt) {
	                formWindowClosing(evt);
	            }
	        });

	        jSearch.setToolTipText("Search here");
	        jSearch.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyReleased(java.awt.event.KeyEvent evt) {
	                jSearchKeyReleased(evt);
	            }
	        });

	        btSuggest.setText("Suggestions");
	        btSuggest.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btSuggestActionPerformed(evt);
	            }
	        });

	        btRecent.setText("Recents");
	        btRecent.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btRecentActionPerformed(evt);
	            }
	        });

	        btTexttoSpeech.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\icon\\speaker.png")); // NOI18N
	        btTexttoSpeech.setToolTipText("Text to speech");
	        btTexttoSpeech.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btTexttoSpeechActionPerformed(evt);
	            }
	        });

	        jLabel1.setText("Search");

	        jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
	        jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
	            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
	                jListValueChanged(evt);
	            }
	        });
	        jScrollPane3.setViewportView(jList);

	        meaningsArea.setEditable(false);
	        meaningsArea.setAutoscrolls(false);
	        jScrollPane1.setViewportView(meaningsArea);

	        jRemove.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\icon\\remove.png")); // NOI18N
	        jRemove.setToolTipText("Remove this word");
	        jRemove.setMaximumSize(new java.awt.Dimension(55, 26));
	        jRemove.setMinimumSize(new java.awt.Dimension(55, 26));
	        jRemove.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRemoveActionPerformed(evt);
	            }
	        });

	        btNewWord.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\icon\\addicon.png")); // NOI18N
	        btNewWord.setToolTipText("Add a new word");
	        btNewWord.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btNewWordActionPerformed(evt);
	            }
	        });

	        btEditWord.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\icon\\edit.png")); // NOI18N
	        btEditWord.setToolTipText("Edit this word");
	        btEditWord.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btEditWordActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(btSuggest, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btRecent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addComponent(jSearch, javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(8, 8, 8)
	                                .addComponent(jLabel1)))
	                        .addGap(0, 0, Short.MAX_VALUE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(92, 92, 92)
	                        .addComponent(jRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(btNewWord, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(12, 12, 12)
	                        .addComponent(btEditWord, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(btTexttoSpeech, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addGap(5, 5, 5)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(btNewWord, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
	                    .addComponent(btEditWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(btTexttoSpeech)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(btSuggest)
	                        .addComponent(btRecent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jScrollPane1)
	                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
	                .addContainerGap())
	        );

	        pack();
	    }// </editor-fold>//GEN-END:initComponents

	    private void btRecentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecentActionPerformed
	        // TODO add your handling code here:
	        
	        modelRecent = new DefaultListModel();
	        for(int i=recentList.size()-1; i>0; i--){
	            modelRecent.addElement(recentList.get(i));
	        }
	        jList.setModel(modelRecent);
	        showingContent = 1;
	    }//GEN-LAST:event_btRecentActionPerformed

	    private void jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListValueChanged
	        // TODO add your handling code here:
	        showWord = jList.getSelectedValue();
	        if(data.list.indexOf(showWord)==-1)
	            meaningsArea.setText("Choose a word");
	        else {
	            meaningsArea.setText(data.meanings.get(data.list.indexOf(showWord)).toString());
	            recent.addWord(recentList, showWord);
	        }
	    }//GEN-LAST:event_jListValueChanged

	    private void jSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyReleased
	        // TODO add your handling code here:
	        suggestionUpdate();
	        showingContent = 0;
	    }//GEN-LAST:event_jSearchKeyReleased

	    private void btSuggestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuggestActionPerformed
	        // TODO add your handling code here:
	        suggestionUpdate();
	        showingContent = 0;
	    }//GEN-LAST:event_btSuggestActionPerformed

	    private void jRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveActionPerformed
	        // TODO add your handling code here:
	        if(jList.getSelectedValue()==null){
	            JOptionPane.showMessageDialog(null, "Choose a word");
	        }
	        else{
	            int pt = data.list.indexOf(jList.getSelectedValue());
	            int click = JOptionPane.showConfirmDialog(null, "You are deleting this word, continue ?", "Think twice", JOptionPane.YES_NO_OPTION);
	            if(click == JOptionPane.YES_OPTION){
	                if(showingContent == 0){
	                    modify.removeWord(data.list.get(pt).toString(), data.list, data.meanings);
	                    model.removeElementAt(jList.getSelectedIndex());

	                    jList.setModel(model);
	                }
	                else{
	                    recentList.remove(jList.getSelectedValue());
	                    modelRecent.removeElementAt(jList.getSelectedIndex());
	                    jList.setModel(modelRecent);
	                }
	            }
	        }
	    }//GEN-LAST:event_jRemoveActionPerformed

	    private void btNewWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewWordActionPerformed
	        // TODO add your handling code here:
	        whatToDo = 0;
	        if(mf == null){
	            mf = new ModifyFrame();
	            mf.setVisible(true);
	        }
	        mf.setVisible(true);
	        mf.newMeaning.setContentType("text/plain");
	    }//GEN-LAST:event_btNewWordActionPerformed

	    private void btEditWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditWordActionPerformed
	        // TODO add your handling code here:
	        whatToDo = 1;
	        if(jList.getSelectedValue() == null){
	            JOptionPane.showMessageDialog(null, "Select a word");
	        }
	        else{
	            if(mf == null){
	            mf = new ModifyFrame();
	            mf.setVisible(true);
	            }
	        mf.setVisible(true);
	        mf.newMeaning.setContentType("text/html");
	        }
	        mf.newWord.setText(jList.getSelectedValue());
	        mf.newMeaning.setText(meaningsArea.getText());
	    }//GEN-LAST:event_btEditWordActionPerformed
	    private static final String VOICENAME ="kevin16";
	    private void btTexttoSpeechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTexttoSpeechActionPerformed
	        // TODO add your handling code here:
	        Voice voice;
	        VoiceManager vm = VoiceManager.getInstance();
	        voice = vm.getVoice(VOICENAME);
	        
	        voice.allocate();
	        if(jList.getSelectedValue() == null)
	            JOptionPane.showMessageDialog(null, "Choose a word");
	        else{
	            try {
	            voice.speak(jList.getSelectedValue());
	            } catch (Exception e) {
	            }
	        } 
	    }//GEN-LAST:event_btTexttoSpeechActionPerformed

	    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
	        // TODO add your handling code here:
	        int click = JOptionPane.showConfirmDialog(null, "You want to quit and save ?", "Quit", JOptionPane.YES_NO_OPTION);
	        if(click == JOptionPane.YES_OPTION){
	            recent.write(recentList);
	            modify.writeList(data.list, data.meanings);
	            System.exit(0);
	        }
	        
	    }//GEN-LAST:event_formWindowClosing

	    public static void main(String args[]) {
	        /* Set the Nimbus look and feel */
	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	         */
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new MainFrame().setVisible(true);
	            }
	        });
	    }

	    public class ModifyFrame extends javax.swing.JFrame {
	        String word, meaning;

	        public ModifyFrame() {
	            initComponents();
	        }
	        @SuppressWarnings("unchecked")
	        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	        private void initComponents() {

	            newWord = new javax.swing.JTextField();
	            jLabel1 = new javax.swing.JLabel();
	            jLabel2 = new javax.swing.JLabel();
	            btSave = new javax.swing.JButton();
	            btCancel = new javax.swing.JButton();
	            jScrollPane2 = new javax.swing.JScrollPane();
	            newMeaning = new javax.swing.JEditorPane();
	            newMeaning.setContentType("text/html");

	            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	            setTitle("Modify your word");

	            newWord.addActionListener(new java.awt.event.ActionListener() {
	                public void actionPerformed(java.awt.event.ActionEvent evt) {
	                    newWordActionPerformed(evt);
	                }
	            });

	            jLabel1.setText("Word:");

	            jLabel2.setText("What does it mean?");

	            btSave.setText("Save");
	            btSave.addActionListener(new java.awt.event.ActionListener() {
	                public void actionPerformed(java.awt.event.ActionEvent evt) {
	                    btSaveActionPerformed(evt);
	                }
	            });

	            btCancel.setText("Cancel");
	            btCancel.addActionListener(new java.awt.event.ActionListener() {
	                public void actionPerformed(java.awt.event.ActionEvent evt) {
	                    btCancelActionPerformed(evt);
	                }
	            });

	            jScrollPane2.setViewportView(newMeaning);

	            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	            getContentPane().setLayout(layout);
	            layout.setHorizontalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(layout.createSequentialGroup()
	                            .addContainerGap()
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(newWord)
	                                .addGroup(layout.createSequentialGroup()
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addGap(0, 0, Short.MAX_VALUE))))
	                        .addGroup(layout.createSequentialGroup()
	                            .addGap(191, 191, 191)
	                            .addComponent(btSave)
	                            .addGap(27, 27, 27)
	                            .addComponent(btCancel)
	                            .addGap(0, 180, Short.MAX_VALUE))
	                        .addGroup(layout.createSequentialGroup()
	                            .addContainerGap()
	                            .addComponent(jScrollPane2)))
	                    .addContainerGap())
	            );
	            layout.setVerticalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addGap(16, 16, 16)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(newWord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addComponent(jLabel2)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(btSave)
	                        .addComponent(btCancel))
	                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            );

	            pack();
	        }// </editor-fold>                        

	        private void newWordActionPerformed(java.awt.event.ActionEvent evt) {                                        
	            // TODO add your handling code here:
	        }                                       
	        private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {                                         
	            // TODO add your handling code here:
	            newWord.setText("");
	            newMeaning.setText("");
	            setVisible(false);
	        }                                        
	        private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {                                       
	            // TODO add your handling code here:
	            word = newWord.getText();
	            meaning = newMeaning.getText();

	                if(whatToDo == 0){
	                    if(word == null || meaning == null) JOptionPane.showMessageDialog(null, "Type in something");
	                    else{
	                        modify.addWord(word, meaning, data.list, data.meanings);  
	                        suggestionUpdate();
	                    }
	                }
	                else{
	                    if(word == null || meaning == null) JOptionPane.showMessageDialog(null, "Type in something");
	                    else{
	                        modify.editword(word, meaning, jList.getSelectedValue(), data.list, data.meanings);
	                        suggestionUpdate();
	                    }
	                }
	                newWord.setText("");
	                newMeaning.setText("");
	                setVisible(false);
	        }                                
	        private javax.swing.JButton btCancel;
	        private javax.swing.JButton btSave;
	        private javax.swing.JLabel jLabel1;
	        private javax.swing.JLabel jLabel2;
	        private javax.swing.JScrollPane jScrollPane2;
	        private javax.swing.JEditorPane newMeaning;
	        private javax.swing.JTextField newWord;
	    }
	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton btEditWord;
	    private javax.swing.JButton btNewWord;
	    private javax.swing.JButton btRecent;
	    private javax.swing.JButton btSuggest;
	    private javax.swing.JButton btTexttoSpeech;
	    private javax.swing.JFrame jFrame1;
	    private javax.swing.JFrame jFrame2;
	    private javax.swing.JFrame jFrame3;
	    private javax.swing.JFrame jFrame4;
	    private javax.swing.JFrame jFrame5;
	    private javax.swing.JFrame jFrame6;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JList<String> jList;
	    private javax.swing.JMenu jMenu3;
	    private javax.swing.JMenu jMenu4;
	    private javax.swing.JMenuBar jMenuBar2;
	    private javax.swing.JButton jRemove;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane3;
	    private javax.swing.JTextField jSearch;
	    private javax.swing.JEditorPane meaningsArea;
	    // End of variables declaration//GEN-END:variables
	}
