package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {
    private static final String NUMBER = "81993118851";
    private static final PhoneType TYPE = PhoneType.MOBILE;
    private static final long ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(NUMBER)
                .type(TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(ID)
                .number(NUMBER)
                .type(TYPE)
                .build();
    }
}
