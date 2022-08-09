import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class StringCounter implements ActionListener
{
	//Begin variables
	int count;
	String a,b,c,kk,k0k;
	JFrame frm;
	Container con;
	FlowLayout fly;
	JButton[] fbtn;
	BorderLayout bly;
	Panel pnl,pnl2;
	TextField txt1;
	TextField txt2;
	JTextArea wrt;
	JButton[] btn=new JButton[2];
	JLabel lbl,flbl,rlbl;
	//End variables 
	
	//Begin constructor
	void SCount()
	{
		frm=new JFrame();
		con=frm.getContentPane();
		wrt=new JTextArea(12,8);
		
		fly = new FlowLayout();
		con.setLayout(fly);
		
		bly = new BorderLayout();
		con.setLayout(bly);
		
		pnl=new Panel();
		pnl.setLayout(new FlowLayout());
		
		btn[0]=new JButton("Count characters");
		pnl.add(btn[0]);
		flbl= new JLabel("Nothing");
		pnl.add(flbl);
		btn[0].addActionListener(this);
		btn[1]=new JButton("Count Words");
		pnl.add(btn[1]);
		rlbl= new JLabel("Nothing");
		pnl.add(rlbl);
		btn[1].addActionListener(this);
		
		con.add(wrt,BorderLayout.NORTH);
		con.add(pnl,BorderLayout.CENTER);
		
		frm.setSize(400,400);
		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//End constructor
	public static void main(String args[])
	{
		StringCounter c=new StringCounter();
		c.SCount();
	}
	
	//Other Methods
	public void actionPerformed(ActionEvent e)
	{
		a=e.getActionCommand();
		c=wrt.getText();
		if(a=="Count characters")
			flbl.setText(c.length()+"");
		if(a=="Count Words")
		{
			String[] words= c.split("\\s+");
			rlbl.setText(words.length+"");
		}
	}
}