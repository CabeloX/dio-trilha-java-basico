public class SmartTV {
    boolean power = false;
    int channel = 1;
    int volume = 10;

    public void on(){
        power = true;
    }

    public void off(){
        power = false;
    }

    public void increaseVolume(){
        volume++;
        System.out.println("Increasing the volume to " + volume);
    }

    public void decreaseVolume(){
        volume--;
        System.out.println("Decreasing the volume to " + volume);
    }

    public void increChannel(){
        channel++;
    }
    public void decreChannel(){
        channel--;
    }
    public void changeChannel(int newChannel){
        channel = newChannel;
    }
}
