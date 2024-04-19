import java.util.Comparator;

class Pc implements Comparable, Comparator {
    private  int id;

    public void setId(int id) {
        this.id = id;
    }

    private String cpu;
    private String ram;
    private String storage;
    private String lcdMaker;
    private boolean hasGpu;
    
    Pc(int id, String cpu, String ram, String storage, String lcdMaker, boolean hasGpu) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getLcdMaker() {
        return lcdMaker;
    }

    public void setLcdMaker(String lcdMaker) {
        this.lcdMaker = lcdMaker;
    }

    public boolean hasGpu() {
        return hasGpu;
    }

    public void setGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nCPU: %s\nRAM: %s\nStorage: %s\nLCD Maker: %s\nGPU: %b\n", id, cpu, ram, storage, lcdMaker, hasGpu);
    }

    @Override
    public int compare(Object o1, Object o2) {
        Pc p1 = (Pc) o1;
        Pc p2 = (Pc) o2;
        if (p1.getId() < p2.getId()){
            return -1;
        } else if (p1.getId() > p2.getId()) {
            return 1;
        }
        return 0;
    }

    @Override
	public boolean equals(Object o){

		Pc p = (Pc)o;
		return this.id == p.id && this.cpu.equals(p.cpu);
	}

	@Override
	public Pc clone(){
		Pc p = new Pc(this.id, this.cpu, this.ram, this.storage, this.lcdMaker, this.hasGpu);
		return p;
	}

    @Override
    public int compareTo(Object o) {
        Pc p = (Pc) o;

        if (p.getId() == this.getId()){
            return 0;
        } else if (p.getId() < this.getId()) {
            return 1;
        }

        return -1;
    }
}
