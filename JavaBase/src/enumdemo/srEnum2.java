package enumdemo;

import lombok.Getter;
import lombok.Setter;

public enum srEnum2 {
	���("̫��","���˷���ȥ����ع�����"),
	�Ÿ�("����","���ù���ǧ��䣬������º�ʿ�㻶��"),
	����("����","�𾡺�֦�����ܣ���įɳ����"),
	�׾���("����","ȡ�λ������عˣ���Ե�޵���Ե��"),
	������("��ɽ","���ϵ���˿����������ɻ���ʼ��"),
	����("��֮","���粻�����ɱ㣬ͭȸ����������");
	 
	@lombok.Getter@lombok.Setter
	private String desc;
	@Getter@Setter 
	private String shiju;
	
	
	
     private srEnum2(String desc, String shiju) {
		this.desc = desc;
		this.shiju = shiju;
	}

	private srEnum2() {
		
	}
     
     private srEnum2(String desc) {
		this.desc = desc ;
	}
	
    
}
