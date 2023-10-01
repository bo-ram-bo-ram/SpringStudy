package inflearn.core.member;

public interface MemberService {
    //회원가입 + 회원조회

    void join(Member member);
    Member findMember(Long memberId);
}
