package Hrms.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="job_positions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdverts"})
public class JobPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //veri tabanındaki idyi tek tek arttır.
	
	@Column(name="id")
	private int id;
	
	@Column(name="job_position")
	private String title;
	
	//@data =lombok tarafından getter ve settırları getirir
	// @entity =entiy interfacei yapmamıza gerek yok
	//@table=veri tabanında hangi tabloya karşılık geleceğini gösterir örn:(name="products")
	//@column =hangi tabloya geleceğini gösterir örn:(name="product_id")
	//@id =id alanının hangisi olduğunu dememiz gerek.
	//@AllArgsConstructor=konstructora gerek yok this
	//@norargsconstructer =boş konstructar
	
	

}
