package Generic.WhatIsGeneric;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
    }

    public void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());
        checkDTO(dto2);

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());
        checkDTO(dto3);
    }

    public void checkDTO(CastingDTO dto) {
        Object tempObject = dto.getObject();
        if (tempObject instanceof StringBuffer) {
            System.out.println("StringBuffer");
        } else if (tempObject instanceof StringBuilder) {
            System.out.println("StringBuilder");
        }
    }
}
