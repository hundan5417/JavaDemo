package enumdemo;

import lombok.Getter;
import lombok.Setter;

public enum srEnum2 {
	李白("太白","事了拂衣去，深藏功与名"),
	杜甫("子美","安得广厦千万间，大庇天下寒士俱欢颜"),
	苏轼("东坡","拣尽寒枝不肯栖，寂寞沙洲冷"),
	白居易("乐天","取次花丛懒回顾，半缘修道半缘君"),
	李商隐("义山","春蚕到死丝方尽，蜡炬成灰泪始干"),
	杜牧("牧之","东风不与周郎便，铜雀春深锁二乔");
	 
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
