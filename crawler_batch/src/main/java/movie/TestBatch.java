package movie;

import test.TestDto;

public class TestBatch {

    public static void main(String[] args){
        TestDto testDto = new TestDto();
        testDto.setData("HELLO WORLD");

        System.out.println(testDto.getData());
    }
}
