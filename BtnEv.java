import java.awt.*;
import java.awt.event.ActionListener;	// 操作したら機能
import java.awt.event.ActionEvent;	// イベント機能

class BtnEv extends Frame implements ActionListener{
	Button a,a2;	// オブジェクト作成は一番上で宣言する
	Label b;
	Panel p;

	BtnEv(){	//　コンストラクタ＝初期設定
		setSize(400,300);

		a = new Button("クリックしてください");
		a2 = new Button("click");
		b = new Label("ここに表示",Label.CENTER);

		p = new Panel();
		p.setLayout(new GridLayout(1,2));
		p.add(a);
		p.add(a2);

		setLayout(new BorderLayout());
		add("Center", b);
		add("South", p);

		a.addActionListener(this);	// 操作したら
		a2.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e){	// イベントを実行
			if(e.getSource() == a){ 
				b.setText("押したね");
			}
			if(e.getSource() == a2){
				b.setText("こっちも押したね");
			}
		}
		public static void main(String args[]){
			BtnEv f;
			f = new BtnEv();
			f.setVisible(true);
		}
}