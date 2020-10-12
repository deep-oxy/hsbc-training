package com.demo.sping.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

	@Autowired
	private Ram ram;
	@Autowired
	private Storage storage;
	@Autowired
	private Display display;
	@Autowired
	private CPU cpu;

	public Computer() {

	}

	public Computer(Ram ram, Storage storage, Display display, CPU cpu) {
		this.ram = ram;
		this.storage = storage;
		this.display = display;
		this.cpu = cpu;
	}

	public Ram getRam() {
		return ram;
	}

	public Storage getStorage() {
		return storage;
	}

	public Display getDisplay() {
		return display;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void getSpecs() {
		System.out.println(ram.getRamSize() + " " + ram.getRamType() + " " + cpu.getCpuFrequency() + " "
				+ cpu.getCpuType() + " " + storage.getStorageSize() + " " + storage.getStorageType() + " "
				+ display.getDisplayMemory() + " " + display.getDisplayType() + " " + display.getResolution());
		;
	}

}
