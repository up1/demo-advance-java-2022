package solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DemoOcp {
    public static void main(String[] args) {
        // Process A

        // Builder, Factory  => Design pattern
        ValidationRule[] rules = {
                        new NotNullAndEmptyValidation(),
                        new EmailValidation()
        };
        var input = "1234";
        for (ValidationRule rule : rules) {
            rule.validate(input);
        }
    }
}

abstract class ValidationRule<T> {
    abstract boolean validate(T input);
}

class NotNullAndEmptyValidation extends ValidationRule<String> {
    @Override
    boolean validate(String input) {
        return false;
    }
}

class EmailValidation extends ValidationRule<String> {
    @Override
    boolean validate(String input) {
        return false;
    }
}

class NumberValidation extends ValidationRule<Integer> {
    @Override
    boolean validate(Integer input) {
        return false;
    }
}

class CalculationCampaign {

    static Map<Integer, Campaign> campaignMap = new HashMap<>();
    static {
        campaignMap.put(1, new CampaignA());
        campaignMap.put(2, new CampaignB());
    }

    double process(int id){
        return campaignMap.get(id).calculatePrice(id);
    }

}

abstract class Campaign {
    abstract double calculatePrice(int id);
}
class CampaignA extends Campaign {
    @Override
    double calculatePrice(int id) {
        return 0;
    }
}
class CampaignB extends Campaign {
    @Override
    double calculatePrice(int id) {
        return id*5;
    }
}

class CampaignBV2 extends Campaign {
    @Override
    double calculatePrice(int id) {
        return id*10;
    }
}
