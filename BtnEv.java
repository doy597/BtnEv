import java.awt.*;
import java.awt.event.ActionListener;	// ���삵����@�\
import java.awt.event.ActionEvent;	// �C�x���g�@�\

class BtnEv extends Frame implements ActionListener{
	Button a,a2;	// �I�u�W�F�N�g�쐬�͈�ԏ�Ő錾����
	Label b;
	Panel p;

	BtnEv(){	//�@�R���X�g���N�^�������ݒ�
		setSize(400,300);

		a = new Button("�N���b�N���Ă�������");
		a2 = new Button("click");
		b = new Label("�����ɕ\��",Label.CENTER);

		p = new Panel();
		p.setLayout(new GridLayout(1,2));
		p.add(a);
		p.add(a2);

		setLayout(new BorderLayout());
		add("Center", b);
		add("South", p);

		a.addActionListener(this);	// ���삵����
		a2.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e){	// �C�x���g�����s
			if(e.getSource() == a){ 
				b.setText("��������");
			}
			if(e.getSource() == a2){
				b.setText("����������������");
			}
		}
		public static void main(String args[]){
			BtnEv f;
			f = new BtnEv();
			f.setVisible(true);
		}
}