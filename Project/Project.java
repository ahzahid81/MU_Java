import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// import javax.swing.JOptionPane;
import javax.swing.*;

public class Project extends JFrame 
{
    private JButton Button1; 
    private JButton Button2; 
    private JButton Button3;

    public Project()
    {
        super("Project for OOP");
        setLayout( new FlowLayout() ); 
        Button1 = new JButton( "Programmes of Software Engineering");

        add( Button1 );

       
        Button2 = new JButton( "Programmes of Computer Science Engineering");

        add( Button2 );

        Button3 = new JButton("Project Submitted to Fuad Sir. Created By Zahid");
        add(Button3);



        ButtonHandler handler = new ButtonHandler();
        Button2.addActionListener( handler );
        Button1.addActionListener( handler );
    } 

    private class ButtonHandler implements ActionListener 
    {
        public void actionPerformed( ActionEvent event )
        {
            if(event.getSource() == Button1)
            {
                String Text = "<html>B.Sc in Software Engineering<br> Head: Fuad Ahmed Sir <br><ul><li>Duration: 4 Years" + "<li>Total Credits: 160" + "<li>Availability: Day" + "<li>Entry Time: January/July</u></ul>Programme Summary:\n\n The BSc in Software Engineering is a 48(forty-eight) months-long undergraduate programme\n for those, who intend to achieve a Bachelor of Science degree from the department of\n software engineering. Students have to complete 148 credits theory and lab courses along\n with 12 credits internship from any reputed software development firm, a total of 160 credits\n to be a graduate. The programme is designed on the basis of outcome-based curriculum\n equipped with science & mathematics courses, general education courses, core computer\n science courses, specialized courses on software analysis, design, development, software\n quality assurance and a sufficient number of courses on most recent trends. The programme\n will motivate the graduates to go that extra mile through learning new skills and improving\n existing ones, which is a trait that can only be achieved by striving for excellence.";
                JOptionPane.showMessageDialog( null, Text, "Honors Programmes of B.Sc. in Software Engineering", JOptionPane.INFORMATION_MESSAGE );
                
            }

            if(event.getSource() == Button2)
            {

                String Text = "<html>B.Sc. in CSE<ul><li>Duration: 4 Years" + "<li>Total Credits: 150" + "<li>Availability: Day/Evening" + "<li>Entry Time: January/July</u></ul>Programme Summary:\n\n The B.Sc. (CSE) programme is a 48 (forty-eight)-month study of 8 semesters for regular\n students. A student should complete at least 150 credits to be a graduate. The program is\n intended for students who want to obtain a sound theoretical and technical knowledge in\n Computer Science. The job market in computer Science and Information Technology is robust\n and growing in a geometric profession in Bangladesh and throughout the world. Over the\n next several decades, Computer Scientist will continue to reshape our familiar world.";
                JOptionPane.showMessageDialog( null, Text, "Honors Programmes of B.Sc. in Computer Science Engineering", JOptionPane.INFORMATION_MESSAGE );
            }
        }
    }

    public static void main(String[] args) 
    {
        Project project = new Project();
        project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        project.setSize(375,190);
        project.setVisible(true);
    }
}
