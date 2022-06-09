package co.com.utest.automation.challenge.datadefinitions;

import co.com.utest.automation.challenge.model.Devices;
import co.com.utest.automation.challenge.model.User;


import java.util.Map;

public class DataDefinitions {

  //  @ParameterType(".*")
    public User user(String gender) {
        return new User(gender);
    }

 //   @DataTableType
    public Devices devices(Map<String ,String> devices){
        return new Devices(
                devices.get("computer"),
                devices.get("version"),
                devices.get("language"),
                devices.get("mobile"),
                devices.get("model"),
                devices.get("system")
        );

    }
}
