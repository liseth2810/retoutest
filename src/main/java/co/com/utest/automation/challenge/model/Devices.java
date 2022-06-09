package co.com.utest.automation.challenge.model;

public class Devices {

    private String computer;
    private String version;
    private String language;
    private String mobile;
    private String model;
    private String system;

    public Devices(String computer,String version,String language,String mobile,String model,String system){

        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobile = mobile;
        this.model = model;
        this.system = system;
    }

    public String getComputer() {
        return computer;
    }

    public String getVersion() {
        return version;
    }

    public String getLanguage() {
        return language;
    }

    public String getMobile() {
        return mobile;
    }

    public String getModel() {
        return model;
    }

    public String getSystem() {
        return system;
    }
}
