package guru.springframework.api.domain;

import javax.smartcardio.Card;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Konstantin Romanov
 * @created 28/05/2020 - 20:07
 * @project spring-rest-client
 */
public class Billing implements Serializable {

    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6577338081290507077L;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
