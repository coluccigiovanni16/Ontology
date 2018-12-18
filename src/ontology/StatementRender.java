package ontology;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

public class StatementRender extends JPanel implements ListCellRenderer<Info> {

    private JLabel lbIcon = new JLabel();
    private JLabel lbLabel = new JLabel();
    private JLabel lbDefinition = new JLabel();
    private JPanel panelText;
    private JPanel panelIcon;

    public StatementRender() {
        setLayout(new BorderLayout(5, 8));
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        panelText = new JPanel(new GridLayout(2, 1));
        panelText.add(lbLabel);
        panelText.add(lbDefinition);

        panelIcon = new JPanel();
        panelIcon.setBorder(new EmptyBorder(3, 3, 3, 3));
        panelIcon.add(lbIcon);

        add(panelIcon, BorderLayout.WEST);
        add(panelText, BorderLayout.CENTER);
    }

    public Component getListCellRendererComponent(JList<? extends Info> list,
            Info info, int index, boolean isSelected, boolean cellHasFocus) {

        lbIcon.setIcon(new ImageIcon(getClass().getResource(info.getIconName() + ".jpg")));

        lbLabel.setText(info.getLabel() + " | " + info.getId() + " | " + info.getSubClass());
        lbDefinition.setText(info.getDefinition());

        // set Opaque to change background color of JLabel
        lbLabel.setOpaque(true);
        lbDefinition.setOpaque(true);
        lbIcon.setOpaque(true);
        lbLabel.setFont(new Font("Ariel ", Font.BOLD, 20));
        lbLabel.setForeground(Color.BLACK);

        // when select item
        if (isSelected) {
            lbLabel.setBackground(list.getSelectionBackground());
            lbDefinition.setBackground(list.getSelectionBackground());
            lbIcon.setBackground(list.getSelectionBackground());
            setBackground(list.getSelectionBackground());
            panelIcon.setBackground(list.getSelectionBackground());
        } else { // when don't select
            lbLabel.setBackground(list.getBackground());
            lbDefinition.setBackground(list.getBackground());
            lbIcon.setBackground(list.getBackground());
            setBackground(list.getBackground());
            panelIcon.setBackground(list.getBackground());
        }
        return this;
    }
}
