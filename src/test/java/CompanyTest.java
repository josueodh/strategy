import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    @Test
    void shouldCalculateMG(){
        Company company = new Company();
        company.taxMag(100f);
        assertEquals(110.0f, company.getTax());
    }

    @Test
    void shouldCalculateSP(){
        Company company = new Company();
        company.taxSP(100f);
        assertEquals(115.0f, company.getTax());
    }
}