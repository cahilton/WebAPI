package org.ohdsi.webapi.evidence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author rkboyce and m_rasteger
 */
@JsonInclude(Include.NON_NULL)
public class HoiEvidence {
    @JsonProperty("EVIDENCE")
    public String evidence;
    
    @JsonProperty("MODALITY")
    public String modality;
    
    @JsonProperty("LINKOUT")
    public String linkout;

    @JsonProperty("DRUG")
    public String drug;	
    
    @JsonProperty("COUNT")
    public Integer count;	

}
