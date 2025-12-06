public class Member {
    private static Integer nextMemberId=1;
    private  Integer memberId;
    private String name;
    public Member(){}
    public Member(String name) {
        this.memberId = nextMemberId++;
        this.name = name;
    }
    public Integer getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                '}';
    }
}
