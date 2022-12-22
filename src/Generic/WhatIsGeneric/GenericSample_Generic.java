package Generic.WhatIsGeneric;

public class GenericSample_Generic {
    public static void main(String[] args) {
        GenericSample_Generic sample = new GenericSample_Generic();
        sample.checkGenericDTO();
    }

    public void checkGenericDTO() {
        CastingDTO_Generic<String> dto1 = new CastingDTO_Generic<String>();
        dto1.setObject(new String());
        CastingDTO_Generic<StringBuffer> dto2 = new CastingDTO_Generic<StringBuffer>();
        dto2.setObject(new StringBuffer());
        CastingDTO_Generic<StringBuilder> dto3 = new CastingDTO_Generic<StringBuilder>();
        dto3.setObject(new StringBuilder());

        // 형변환 없이 getObject() 메소드를 사용하여 객체를 가져올 수 있어서 더 편리함
        String temp1 = dto1.getObject();
        StringBuffer temp2 = dto2.getObject();
        StringBuilder temp3 = dto3.getObject();
    }
}
