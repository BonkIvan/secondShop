package by.bonk.secondShop.controller.command;

//Необходит для создания объектов по роле пользователя
public record CommandKey (String page, String role, String method){
}
