package stateexam;

public class PortableComputer {
    boolean isConnectedToWirelessNetwork;
    int sizeGB;
    double frequencyGHZ;
    
    private static int connectedComutersCount;

    public static int getConnectedComutersCount() {
        return connectedComutersCount;
    }

    public static void setConnectedComutersCount(int connectedComutersCount) {
        PortableComputer.connectedComutersCount = connectedComutersCount;
    }
    
    private int processorsCount;

    private boolean isTurnedOn;
    
    public int getProcessorsCount() {
        return processorsCount;
    }

    public void setProcessorsCount(int processorsCount) {
        this.processorsCount = processorsCount;
    }

    public boolean getIsTurnedOn() {
        return isTurnedOn;
    }

    public void setIsTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public PortableComputer() {
        this.isConnectedToWirelessNetwork = false;
        this.sizeGB = 0;
        this.frequencyGHZ = 0;
    }
    
    public PortableComputer(PortableComputer computer) {
        this.isConnectedToWirelessNetwork = computer.isConnectedToWirelessNetwork;
        this.sizeGB = computer.sizeGB;
        this.frequencyGHZ = computer.frequencyGHZ;
    }
    
    public PortableComputer(boolean isConnectedToWirelessNetwork, int sizeGB, double frequencyGHZ) {
        this.isConnectedToWirelessNetwork = isConnectedToWirelessNetwork;
        this.sizeGB = sizeGB;
        this.frequencyGHZ = frequencyGHZ;
    }
}
