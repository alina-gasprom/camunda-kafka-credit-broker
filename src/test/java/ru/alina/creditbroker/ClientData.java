package ru.alina.creditbroker;

import ru.alina.creditbroker.dto.UserDto;

public class ClientData {
    public final static long CLIENT_ID_1 = 1L;
    public final static long CLIENT_ID_2 = 2L;
    public final static long CLIENT_ID_3 = 3L;

    public final static UserDto USER_EXIST = new UserDto("Джексон", "Майкл", "Майколович", "1111", "666666");
    public final static UserDto USER_NOT_EXIST = new UserDto("Джексон", "Майкл", "Майколович", "1111", "666664");
}
