package com.wocai.jrt.test;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.vteba.utils.charstr.Char;

public class Test {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);

		String encodedPassword = "$04$ECz9mBCVxfmyH4iG0l3k2ehQ/9MCppJihHVaUL3Ym1cmRjxfeVK9";//encoder.encode("abc123");
		
		boolean r = encoder.matches("abc123", encodedPassword);
		
		System.out.println(r);
	}

	@org.junit.Test
	public void test() {
		ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		WriteLock writeLock = lock.writeLock();
		writeLock.lock();
		writeLock.unlock();
		
		
		
	}
	
	@org.junit.Test
	public void test2() {
		byte[] aa = {102, 97, 108, 115, 101, 44, -26, -119, -117, -26, -100, -70, -27, -113, -73, -25, -96, -127, -29, -128, -112, 49, 53, 54, 53, 56, 49, 55, 53, 49, 56, -29, -128, -111, -26, -105, -96, -26, -107, -120};
		String s = new String(aa, Char.UTF8);
		System.out.println(s);
		s = new String(aa, Char.ISO88591);
		System.out.println(s);
	}
}
