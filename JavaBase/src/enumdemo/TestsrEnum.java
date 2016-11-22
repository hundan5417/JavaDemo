package enumdemo;

import java.io.PrintStream;
import java.util.Iterator;

public class TestsrEnum {
	public static void print(srEnum cmz) {
		PrintStream out = System.out;
		switch (cmz) {
		case 李白:
			out.println("事了拂衣去，深藏功与名");
			break;
		case 杜甫:
			out.println("安得广厦千万间，大庇天下寒士俱欢颜");
			break;
		case 苏轼:
			out.println("拣尽寒枝不肯栖，寂寞沙洲冷");
			break;
		case 杜牧:
			out.println("东风不与周郎便，铜雀春深锁二乔");
			break;
		case 李商隐:
			out.println("春蚕到死丝方尽，蜡炬成灰泪始干");
			break;

		default:
			out.println("取次花丛懒回顾，半缘修道半缘君");

			break;
		}

	}

	public static void print2(srEnum2 cmz) {
		PrintStream out = System.out;
		switch (cmz) {
		case 李白:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;
		case 杜甫:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;
		case 苏轼:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;
		case 杜牧:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;
		case 李商隐:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;

		default:
			out.println(cmz.getDesc() + cmz.getShiju());

			break;
		}

	}

	public static void main(String[] args) {
		// print(srEnum.李白);
		// print(srEnum.李商隐);
		// print(srEnum.杜牧);
		// print(srEnum.杜甫);
		// print(srEnum.白居易);//上述case中没有“白居易”这一枚举类型，所以直接走到最后输出 default中的值
		// print(srEnum.苏轼);
		print2(srEnum2.李商隐);
		print2(srEnum2.李白);
		print2(srEnum2.杜牧);
		print2(srEnum2.杜甫);
		print2(srEnum2.白居易);
		print2(srEnum2.苏轼);
		
		
		for (srEnum2 string : srEnum2.values()) {
			print2(string);
			
		}
	}

}
