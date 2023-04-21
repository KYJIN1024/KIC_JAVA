import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeEx01 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JTreeEx01 frame = new JTreeEx01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JTreeEx01() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(34, 27, 209, 429);
        contentPane.add(scrollPane);

        JTree tree = new JTree();
        tree.setModel(new DefaultTreeModel(makeTree("root")));
        scrollPane.setViewportView(tree);
    }

    public DefaultMutableTreeNode makeTree(String rootName) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);

        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("colors");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("sports");
        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("food");

        root.add(node1);
        root.add(node2);
        root.add(node3);

        addChildren(node1, "파랑", "보라", "빨강", "노랑");
        addChildren(node2, "농구", "축구", "야구", "농구");
        addChildren(node3, "hot dogs", "pizza", "ravioli", "bananas");

        return root;
    }

    private void addChildren(DefaultMutableTreeNode parent, String... children) {
        for (String child : children) {
            parent.add(new DefaultMutableTreeNode(child));
        }
    }
}