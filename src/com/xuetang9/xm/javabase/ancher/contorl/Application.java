package com.xuetang9.xm.javabase.ancher.contorl;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.xuetang9.xm.javabase.ancher.entity.Ancher;
import com.xuetang9.xm.javabase.ancher.service.Manager;
import com.xuetang9.xm.javabase.utils.StringDataUtils;

/**
 *  测试类
 * @author 老九学堂-大师兄
 * @time 2017年8月10日 - 下午7:47:11
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home http://www.xuetang9.com
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Application {
	
	/**
	 * 管理类对象
	 */
	private Manager manager;
	/**
	 * 输入扫描器
	 */
	private Scanner input;
	
	public Application() {
		manager = new Manager();
		input = new Scanner(System.in);
		init();
	}
	
	/**
	 * 初始化操作
	 */
	public void init() {
		Ancher an = new Ancher();
		an.setName("邹胉");
		an.setMoney(600);
		an.setPapulatily(1000);
		manager.add(an);
		Ancher an2 = new Ancher();
		an2.setName("罗晓凤");
		an2.setMoney(900);
		an2.setPapulatily(700);
		manager.add(an2);
	}
	
	/**
	 * 菜单展示
	 */
	public void menu() {
		String [] menustr = {
				"-----------------------------------------------\n",
				"---------    主播管理系统      --------------------\n",
				"---------       1. 招募主播       --------------------\n",
				"---------       2. 主播列表       --------------------\n",
				"---------       3. 打赏主播       --------------------\n",
				"---------       4. 拉黑主播       --------------------\n",
				"---------       5. 财富榜          --------------------\n",
				"---------       6. 人气榜          --------------------\n",
				"-----------------------------------------------\n"
		};
		System.out.println(Arrays.toString(menustr).replaceAll("\\[|\\]|,", ""));
	}
	
	/**
	 * 接收回车或者字符串
	 * @return
	 */
	public String strOrEnter() {
		try {
			byte read = (byte)System.in.read();
			if(read!=13) {
				byte [] buff = new byte[1024];
				int readin = -1,index=0;
				while((readin=System.in.read())!=13) {
					buff[index++]=(byte)readin;
				}
				byte [] nbuff = new byte[buff.length+1];
				nbuff[0]=read;
				System.arraycopy(buff, 0, nbuff, 1, buff.length); // 给数组挪动位置的操作
				return new String(nbuff).trim();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 添加主播
	 */
	public void addAncher() {
		do {
			Ancher ancher = new Ancher(); // 循环一开始创建主播对象
			System.out.print("姓名(回车随机生成):");
			String line = strOrEnter();
			if(line.equals("")) {
				String randName = StringDataUtils.randName();
				System.out.println("随机生成的姓名是:".concat(randName));
				ancher.setName(randName);
			}else {
				ancher.setName(line);
			}
//			ancher.setName(input.next());
			System.out.print("财富:");
			ancher.setMoney(input.nextInt());
			System.out.print("人气:");
			ancher.setPapulatily(input.nextInt());
			manager.add(ancher);
			System.out.println("继续招募新主播(y/n)?");
			if(!"y".equals(input.next())) { // !"y".equals 表示的是不满足跳出，满足equals的时候
				break;
			}
		}while(true);
	}
	
	
	/**
	 * 打赏主播
	 */
	public void gratuity() {
		System.out.print("你要打赏的主播姓名:");
		String name = input.next();
		Ancher ancher = manager.findAncherByName(name);
		if(null!=ancher) {
			System.out.print("打赏金额:");
			int money = input.nextInt(); // 接收打赏金额
			double papulatily = money * (new Random().nextDouble() + 0.7);  // 计算人气值
			ancher.setMoney(ancher.getMoney()+money);  // 增加财富
			ancher.setPapulatily(ancher.getPapulatily() + (int)papulatily); //增加人气
		}
		
	}
	
	/**
	 * 拉黑主播
	 */
	public void blackList() {
		System.out.print("你要拉黑的主播姓名:");
		String name = input.next();
		manager.removeAncher(name);
	}
	
	/**
	 * 开始项目
	 */
	public void start() {		
		do {
			menu();
			System.out.print("输入你的选择:");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				addAncher(); // 输出添加主播
				break;
			case 2:
				manager.display(); // 主播列表
				break;
			case 3:
				gratuity(); // 打赏
				break;
			case 4:
				blackList(); // 拉黑
				break;
			case 5:
				manager.moneyDisplay(); // 财富榜
				break;
			case 6:
				manager.papulatilyDisplay(); // 人气榜
				break;
			default:
				System.err.println("不接受忽悠!");
				break;
			}
		}while(true);
	}
	/**		*/
	
	
	/**
	 * 入口函数
	 * @param args
	 */
	public static void main(String[] args) {
		new Application().start();
		/*Manager manager = new Manager();
		System.out.println("主播管理");
		System.out.println("1. 查看主播");
		Ancher an = new Ancher();
		an.setName("邹胉");
		an.setMoney(100);
		an.setPapulatily(100);
		manager.add(an);
		Ancher an2 = new Ancher();
		an2.setName("罗晓凤");
		an2.setMoney(100);
		an2.setPapulatily(100);
		manager.add(an2);
		System.out.println("2.查看主播");
		manager.display();*/
	}
	
}
