import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

class UserMouseEvent1 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				System.out.println("mouseClicked");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mousePressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseReleased");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseEntered");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseExited");
		}
		
	}


class UserMouseEvent2 extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseClicked");
		
		System.out.println(( (JButton)e.getSource()).getText());
		System.out.println(( (JButton)e.getSource()).getName());
		
		String name = ((JButton)e.getSource()).getName();
		switch( name ) {
		case "button1" :
			System.out.println("btn1 mouseClicked");
			break;
		case "button2" :
			System.out.println("btn2 mousePressed");
			break;
		case "button3" :
			System.out.println("btn3 mouseReleased");
			break;
		default:
			System.out.println("에러");
		}
		
	}
	