package glsid.home.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class IBanqueImpl implements IBanqueMetier {
	
	/*
	 * @Autowired private CompteRepository compteRepository;
	 * 
	 * @Autowired private OperationRepository operationRepository;
	 */
	
	/*
	 * @Override public Compte consulterCompte(String codeCpte) { Compte
	 * cp=compteRepository.findOne(codeCpte); if(cp==null) throw new
	 * RuntimeException("Compte Introuvable !"); return cp; }
	 */
	/*
	 * @Override public void verser(String codeCpte, double montant) { Compte
	 * cp=consulterCompte(codeCpte); Versement v = new Versement(new
	 * Date(),montant,cp); operationRepository.save(v);
	 * cp.setSolde(cp.getSolde()+montant); compteRepository.save(cp); }
	 * 
	 * @Override public void retirer(String codeCpte, double montant) { Compte
	 * cp=consulterCompte(codeCpte); double facilitesCaisse = 0; if(cp instanceof
	 * CompteCourant) facilitesCaisse=((CompteCourant) cp).getDecouvert();
	 * if(cp.getSolde()+facilitesCaisse<montant) throw new
	 * RuntimeException("Solde insuffisant"); Retrait r = new Retrait(new
	 * Date(),montant,cp); operationRepository.save(r);
	 * cp.setSolde(cp.getSolde()-montant); compteRepository.save(cp); }
	 * 
	 * @Override public void virer(String codeCpte1, String codeCpte2, double
	 * montant) { retirer(codeCpte1,montant); verser(codeCpte2,montant); }
	 * 
	 * @Override public Page<Operation> listOperation(String codeCpte, int page, int
	 * size) {
	 * 
	 * return null; }
	 * 
	 * @Override public Compte consulterCompte(String codeCpte) { // TODO
	 * Auto-generated method stub return null; }
	 */}