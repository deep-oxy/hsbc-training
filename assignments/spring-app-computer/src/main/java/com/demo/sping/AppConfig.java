package com.demo.sping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.sping.items.CPU;
import com.demo.sping.items.Display;
import com.demo.sping.items.Ram;
import com.demo.sping.items.Storage;

@Configuration
@ComponentScan(basePackages = "com.demo.sping")
public class AppConfig {

	@Bean
	public Ram ram() {
		Ram ram = new Ram();
		ram.setRamSize(16);
		ram.setRamType("DDR4");
		return ram;

	}

	@Bean
	public Storage storage() {
		Storage storage = new Storage();
		storage.setStorageSize(512);
		storage.setStorageType("SSD");
		return storage;
	}

	@Bean
	public Display display() {
		Display display = new Display();
		display.setResolution("1900x1600");
		display.setDisplayMemory("4GB");
		display.setDisplayType("GTX2100");
		return display;
	}

	@Bean
	public CPU cpu() {
		CPU cpu = new CPU();
		cpu.setCpuFrequency("3.00GHz");
		cpu.setCpuType("Intel corei5");
		return cpu;
	}

}
