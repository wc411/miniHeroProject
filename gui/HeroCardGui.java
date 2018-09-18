package miniheroproject.gui;

import miniheroproject.gui.ButtonEvents;

/**
 * @author Krypton
 */
public class HeroCardGui extends javax.swing.JFrame {

    ButtonEvents buttonEvent = new ButtonEvents();

    /**
     * Creates new form HeroCardGui
     */
    public HeroCardGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        controllPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        firstButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        lastButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        sortingPanel = new javax.swing.JPanel();
        titleRadioButton = new javax.swing.JRadioButton();
        heightRadioButton = new javax.swing.JRadioButton();
        spdRadioButton = new javax.swing.JRadioButton();
        fightingSkillRadioButton = new javax.swing.JRadioButton();
        exitButton = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        titleLab = new javax.swing.JLabel();
        realNameLab = new javax.swing.JLabel();
        heightLab = new javax.swing.JLabel();
        intLab = new javax.swing.JLabel();
        strLab = new javax.swing.JLabel();
        spdLab = new javax.swing.JLabel();
        agiLab = new javax.swing.JLabel();
        fightingLab = new javax.swing.JLabel();
        txtFieldPanel = new javax.swing.JPanel();
        titleTxTField = new javax.swing.JTextField();
        rNTxTField = new javax.swing.JTextField();
        heightTxTField = new javax.swing.JTextField();
        intTxTField = new javax.swing.JTextField();
        strTxTField = new javax.swing.JTextField();
        spdTxTField = new javax.swing.JTextField();
        agiTxTField = new javax.swing.JTextField();
        fightingTxTField = new javax.swing.JTextField();
        bsScrollPanel = new javax.swing.JScrollPane();
        backStoryTxTArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(59, 55, 79));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(59, 55, 79));
        mainPanel.setMaximumSize(new java.awt.Dimension(340, 550));
        mainPanel.setMinimumSize(new java.awt.Dimension(340, 550));
        mainPanel.setPreferredSize(new java.awt.Dimension(340, 550));

        imgLabel.setMaximumSize(new java.awt.Dimension(340, 550));
        imgLabel.setMinimumSize(new java.awt.Dimension(340, 550));
        imgLabel.setPreferredSize(new java.awt.Dimension(340, 550));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        controllPanel.setBackground(new java.awt.Color(59, 55, 79));
        controllPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controll Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        controllPanel.setPreferredSize(new java.awt.Dimension(354, 176));

        buttonPanel.setBackground(new java.awt.Color(59, 55, 79));
        buttonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controll Buttons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        firstButton.setText("First");
        firstButton.setPreferredSize(new java.awt.Dimension(150, 50));
        firstButton.setSize(new java.awt.Dimension(150, 50));
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.setPreferredSize(new java.awt.Dimension(150, 50));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        lastButton.setText("Last");
        lastButton.setPreferredSize(new java.awt.Dimension(150, 50));
        lastButton.setSize(new java.awt.Dimension(200, 50));
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonActionPerformed(evt);
            }
        });

        prevButton.setText("Previous");
        prevButton.setPreferredSize(new java.awt.Dimension(150, 50));
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(firstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sortingPanel.setBackground(new java.awt.Color(59, 55, 79));
        sortingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sorting Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        sortingPanel.setToolTipText("");

        titleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        titleRadioButton.setSelected(true);
        titleRadioButton.setText("Title");
        titleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleRadioButtonActionPerformed(evt);
            }
        });

        heightRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        heightRadioButton.setText("Height");
        heightRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightRadioButtonActionPerformed(evt);
            }
        });

        spdRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        spdRadioButton.setText("Speed");
        spdRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spdRadioButtonActionPerformed(evt);
            }
        });

        fightingSkillRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        fightingSkillRadioButton.setText("Fighting Skills");
        fightingSkillRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightingSkillRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sortingPanelLayout = new javax.swing.GroupLayout(sortingPanel);
        sortingPanel.setLayout(sortingPanelLayout);
        sortingPanelLayout.setHorizontalGroup(
            sortingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sortingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleRadioButton)
                    .addComponent(heightRadioButton)
                    .addComponent(spdRadioButton)
                    .addComponent(fightingSkillRadioButton))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        sortingPanelLayout.setVerticalGroup(
            sortingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heightRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spdRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fightingSkillRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitButton.setText("Exit");
        exitButton.setPreferredSize(new java.awt.Dimension(150, 50));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controllPanelLayout = new javax.swing.GroupLayout(controllPanel);
        controllPanel.setLayout(controllPanelLayout);
        controllPanelLayout.setHorizontalGroup(
            controllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sortingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        controllPanelLayout.setVerticalGroup(
            controllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(controllPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sortingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        infoPanel.setBackground(new java.awt.Color(59, 55, 79));
        infoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        titleLab.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        titleLab.setForeground(new java.awt.Color(255, 255, 255));
        titleLab.setText("Title: ");
        titleLab.setPreferredSize(new java.awt.Dimension(42, 28));

        realNameLab.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        realNameLab.setForeground(new java.awt.Color(255, 255, 255));
        realNameLab.setText("Real Name: ");
        realNameLab.setPreferredSize(new java.awt.Dimension(42, 28));

        heightLab.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        heightLab.setForeground(new java.awt.Color(255, 255, 255));
        heightLab.setText("Height (cm):");
        heightLab.setPreferredSize(new java.awt.Dimension(42, 28));

        intLab.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        intLab.setForeground(new java.awt.Color(255, 255, 255));
        intLab.setText("Intelligence:");
        intLab.setPreferredSize(new java.awt.Dimension(42, 28));

        strLab.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        strLab.setForeground(new java.awt.Color(255, 255, 255));
        strLab.setText("Strength:");
        strLab.setPreferredSize(new java.awt.Dimension(56, 28));

        spdLab.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        spdLab.setForeground(new java.awt.Color(255, 255, 255));
        spdLab.setText("Speed:");
        spdLab.setPreferredSize(new java.awt.Dimension(40, 28));

        agiLab.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        agiLab.setForeground(new java.awt.Color(255, 255, 255));
        agiLab.setText("Agility:");
        agiLab.setPreferredSize(new java.awt.Dimension(44, 28));

        fightingLab.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        fightingLab.setForeground(new java.awt.Color(255, 255, 255));
        fightingLab.setText("Fighting Skills:");
        fightingLab.setPreferredSize(new java.awt.Dimension(93, 28));

        txtFieldPanel.setBackground(new java.awt.Color(59, 55, 79));

        titleTxTField.setBackground(new java.awt.Color(177, 47, 37));
        titleTxTField.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        titleTxTField.setForeground(new java.awt.Color(255, 255, 255));
        titleTxTField.setText("N/A");

        rNTxTField.setBackground(new java.awt.Color(163, 55, 43));
        rNTxTField.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        rNTxTField.setForeground(new java.awt.Color(255, 255, 255));
        rNTxTField.setText("N/A");

        heightTxTField.setBackground(new java.awt.Color(184, 89, 67));
        heightTxTField.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        heightTxTField.setForeground(new java.awt.Color(255, 255, 255));
        heightTxTField.setText("N/A");

        intTxTField.setBackground(new java.awt.Color(82, 137, 158));
        intTxTField.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        intTxTField.setForeground(new java.awt.Color(255, 255, 255));
        intTxTField.setText("N/A");

        strTxTField.setBackground(new java.awt.Color(82, 151, 60));
        strTxTField.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        strTxTField.setForeground(new java.awt.Color(255, 255, 255));
        strTxTField.setText("N/A");
        strTxTField.setToolTipText("");

        spdTxTField.setBackground(new java.awt.Color(144, 92, 117));
        spdTxTField.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        spdTxTField.setForeground(new java.awt.Color(255, 255, 255));
        spdTxTField.setText("N/A");

        agiTxTField.setBackground(new java.awt.Color(171, 152, 73));
        agiTxTField.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        agiTxTField.setForeground(new java.awt.Color(255, 255, 255));
        agiTxTField.setText("N/A");
        agiTxTField.setToolTipText("");

        fightingTxTField.setBackground(new java.awt.Color(164, 83, 88));
        fightingTxTField.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        fightingTxTField.setForeground(new java.awt.Color(255, 255, 255));
        fightingTxTField.setText("N/A");

        javax.swing.GroupLayout txtFieldPanelLayout = new javax.swing.GroupLayout(txtFieldPanel);
        txtFieldPanel.setLayout(txtFieldPanelLayout);
        txtFieldPanelLayout.setHorizontalGroup(
            txtFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleTxTField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(rNTxTField)
                    .addComponent(heightTxTField)
                    .addComponent(intTxTField)
                    .addComponent(strTxTField)
                    .addComponent(spdTxTField)
                    .addComponent(agiTxTField)
                    .addComponent(fightingTxTField))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        txtFieldPanelLayout.setVerticalGroup(
            txtFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleTxTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rNTxTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(heightTxTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(intTxTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(strTxTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spdTxTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agiTxTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fightingTxTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bsScrollPanel.setBackground(new java.awt.Color(59, 55, 79));
        bsScrollPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Back Story:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        bsScrollPanel.setWheelScrollingEnabled(false);

        backStoryTxTArea.setBackground(new java.awt.Color(163, 55, 43));
        backStoryTxTArea.setColumns(20);
        backStoryTxTArea.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        backStoryTxTArea.setForeground(new java.awt.Color(255, 255, 255));
        backStoryTxTArea.setLineWrap(true);
        backStoryTxTArea.setRows(5);
        backStoryTxTArea.setText("N/A");
        bsScrollPanel.setViewportView(backStoryTxTArea);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(realNameLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heightLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(intLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(strLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spdLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agiLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fightingLab, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(realNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heightLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(intLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(strLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spdLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agiLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fightingLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bsScrollPanel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controllPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        buttonEvent.exit();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(buttonEvent.first())));

        titleTxTField.setText(buttonEvent.gettitle());
        rNTxTField.setText(buttonEvent.getrealName());
        heightTxTField.setText(buttonEvent.getheight());
        intTxTField.setText(buttonEvent.getintel());
        strTxTField.setText(buttonEvent.getstr());
        spdTxTField.setText(buttonEvent.getspd());
        agiTxTField.setText(buttonEvent.getagi());
        fightingTxTField.setText(buttonEvent.getfs());
        backStoryTxTArea.setText(buttonEvent.getbackStory());
    }//GEN-LAST:event_firstButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(buttonEvent.next())));

        titleTxTField.setText(buttonEvent.gettitle());
        rNTxTField.setText(buttonEvent.getrealName());
        heightTxTField.setText(buttonEvent.getheight());
        intTxTField.setText(buttonEvent.getintel());
        strTxTField.setText(buttonEvent.getstr());
        spdTxTField.setText(buttonEvent.getspd());
        agiTxTField.setText(buttonEvent.getagi());
        fightingTxTField.setText(buttonEvent.getfs());
        backStoryTxTArea.setText(buttonEvent.getbackStory());
    }//GEN-LAST:event_nextButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(buttonEvent.prev())));

        titleTxTField.setText(buttonEvent.gettitle());
        rNTxTField.setText(buttonEvent.getrealName());
        heightTxTField.setText(buttonEvent.getheight());
        intTxTField.setText(buttonEvent.getintel());
        strTxTField.setText(buttonEvent.getstr());
        spdTxTField.setText(buttonEvent.getspd());
        agiTxTField.setText(buttonEvent.getagi());
        fightingTxTField.setText(buttonEvent.getfs());
        backStoryTxTArea.setText(buttonEvent.getbackStory());
    }//GEN-LAST:event_prevButtonActionPerformed

    private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(buttonEvent.last())));

        titleTxTField.setText(buttonEvent.gettitle());
        rNTxTField.setText(buttonEvent.getrealName());
        heightTxTField.setText(buttonEvent.getheight());
        intTxTField.setText(buttonEvent.getintel());
        strTxTField.setText(buttonEvent.getstr());
        spdTxTField.setText(buttonEvent.getspd());
        agiTxTField.setText(buttonEvent.getagi());
        fightingTxTField.setText(buttonEvent.getfs());
        backStoryTxTArea.setText(buttonEvent.getbackStory());
    }//GEN-LAST:event_lastButtonActionPerformed

    private void heightRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightRadioButtonActionPerformed
        buttonEvent.sortHeight();
        spdRadioButton.setSelected(false);
        fightingSkillRadioButton.setSelected(false);
        titleRadioButton.setSelected(false);
    }//GEN-LAST:event_heightRadioButtonActionPerformed

    private void titleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleRadioButtonActionPerformed
        buttonEvent.sortTitle();
        spdRadioButton.setSelected(false);
        fightingSkillRadioButton.setSelected(false);
        heightRadioButton.setSelected(false);
    }//GEN-LAST:event_titleRadioButtonActionPerformed

    private void spdRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spdRadioButtonActionPerformed
        buttonEvent.sortSpeed();
        heightRadioButton.setSelected(false);
        fightingSkillRadioButton.setSelected(false);
        titleRadioButton.setSelected(false);
    }//GEN-LAST:event_spdRadioButtonActionPerformed

    private void fightingSkillRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightingSkillRadioButtonActionPerformed
        buttonEvent.sortFighting();
        spdRadioButton.setSelected(false);
        heightRadioButton.setSelected(false);
        titleRadioButton.setSelected(false);
    }//GEN-LAST:event_fightingSkillRadioButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HeroCardGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HeroCardGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HeroCardGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HeroCardGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HeroCardGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agiLab;
    private javax.swing.JTextField agiTxTField;
    private javax.swing.JTextArea backStoryTxTArea;
    private javax.swing.JScrollPane bsScrollPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel controllPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fightingLab;
    private javax.swing.JRadioButton fightingSkillRadioButton;
    private javax.swing.JTextField fightingTxTField;
    private javax.swing.JButton firstButton;
    private javax.swing.JLabel heightLab;
    private javax.swing.JRadioButton heightRadioButton;
    private javax.swing.JTextField heightTxTField;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel intLab;
    private javax.swing.JTextField intTxTField;
    private javax.swing.JButton lastButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JTextField rNTxTField;
    private javax.swing.JLabel realNameLab;
    private javax.swing.JPanel sortingPanel;
    private javax.swing.JLabel spdLab;
    private javax.swing.JRadioButton spdRadioButton;
    private javax.swing.JTextField spdTxTField;
    private javax.swing.JLabel strLab;
    private javax.swing.JTextField strTxTField;
    private javax.swing.JLabel titleLab;
    private javax.swing.JRadioButton titleRadioButton;
    private javax.swing.JTextField titleTxTField;
    private javax.swing.JPanel txtFieldPanel;
    // End of variables declaration//GEN-END:variables
}
