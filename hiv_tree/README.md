## Steps taken: </br>

1. Run [BLAST](https://blast.ncbi.nlm.nih.gov/Blast.cgi) </br>
   - Query: [sequence](https://www.ncbi.nlm.nih.gov/nuccore/AF033819.3?report=fasta) </br>
   - Results: [hiv_blast.fa](./hiv_blast.fa)

  
2. Perform Multiple Sequence Alignment using [MUSCLE](https://www.ebi.ac.uk/Tools/msa/muscle/) </br>
   - Query: [hiv_blast.fa](./hiv_blast.fa) </br>
   - Results: [hiv_muscle.fa](./hiv_blasta.fa)
   
   
3. Build a phylogenetic tree using [Simple Phylogeny](https://www.ebi.ac.uk/Tools/phylogeny/simple_phylogeny/) </br>
   - Query: [hiv_muscle.fa](./hiv_blasta.fa) </br>
   - Results:
   

4. Use a ggTree (R Tree package) to visualize the tree: </br>
   -  Input: </br>
   -  Results: 
   
   
   
   
