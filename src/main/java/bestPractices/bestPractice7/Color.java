package bestPractices.bestPractice7;

enum Color {
    /**
     * best practice
     */
    BLACK(0x000000), WHITE(0x000000), RED(0xff0000);
    private int code;

    Color(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
