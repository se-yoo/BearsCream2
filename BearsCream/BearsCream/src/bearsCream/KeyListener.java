package bearsCream;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter{
	public void keyPressed(KeyEvent e){
		
		if(BearsCream.game==null){//���� �������� �ƴ϶��
			return;
		}
		if(BearsCream.game.getState()==Thread.State.TIMED_WAITING&&BearsCream.pause){
			return;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			BearsCream.game.pressLeft();
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			BearsCream.game.pressRight();
		}		
	}
}
