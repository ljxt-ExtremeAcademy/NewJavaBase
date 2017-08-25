/**
 * 
 */
package com.xuetang9.xm.javabase.oop.polymorphic;

/**
 *  上课
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午9:45:08
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Education {
	private ClassRom rom;
	
	private Teacher teacher;
	
	public ClassRom getRom() {
		return rom;
	}

	public void setRom(ClassRom rom) {
		this.rom = rom;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void attend() {
		StringBuilder sbd = new StringBuilder(teacher.getName());
		sbd.append("在").append(rom.getName()).append("上课");
		System.out.println(sbd);
		
		teacher.teach();
		
	}
}
