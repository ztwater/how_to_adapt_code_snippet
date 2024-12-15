# how_to_adapt_code_snippet
The replication package for TSE paper "How Do Developers Adapt Code Snippets to Their Contexts? An Empirical Study of Context-Based Code Snippet Adaptations".

---

## Project Structure

### `interview/`

`Interview_Design.pdf`: Our interview invitation letter, interview design and the slides used during the interview.

`Interview_Results.xlsx`: Our annotated interview results.

### `dataset/`

`all_reviewed_posts_460.xlsx`: The randomly picked 460 SO posts from Stack Overflow. We annotated each post with four fields: 1) whether it contains a code reuse in the linked GitHub code; 2) its reuse granularity; 3) the id of our selected GitHub file and 4) our notes.

`adaptation_dataset.zip`: Our selected 300 code reuse cases for quantitative study. Each case includes a code snippet from Stack Overflow and the corresponding GitHub file that reused the snippet.

`annotated_adaptations.xlsx`: Our manual annotation of 1,384 adaptations in 300 reuse cases.

### `src/`

`quantitative_study.ipynb`: Code for RQ1-4

`RQ3_dist_stats.csv`: The distribution of C-S distance.



### `validation/`

`cases/`: Our randomly sampled 20 adaptation cases from [Zhang et al.](https://ieeexplore.ieee.org/document/8812028)

`validation_for_adaptations.csv`: Our annotated validation results, including the SO file id, GitHub file id, whether contains our four CA patterns and all AST edits of the adaptation case.

