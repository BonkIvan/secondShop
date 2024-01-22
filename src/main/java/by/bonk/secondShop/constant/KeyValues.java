package by.bonk.secondShop.constant;

public enum KeyValues {
    USER_NAME("username"),
    USER_PASSWORD("password"),
    TIME_ZONE("zone");


    private final String paramName;
    KeyValues(String paramName) {
        this.paramName = paramName;
    }
    public String getParamName() {
        return paramName;
    }




//    public String get

}
