;; There is only one block, A, which is on the table.  A sprayer with
;; red paint is on the table.  Our goal is to have A be red and the
;; arm empty.

(define (problem myp0)
  (:domain hw5)
  (:objects A B C)
  (:init (arm-empty)
         (block A)
         (on-table A)
         (clear A)
         (color A red)

         (sprayer B blue)
         (on-table B)
         (clear B)

         (paint-can C blue)
         (on-table C)
         (clear C)
         )
  (:goal (and (arm-empty)
              (color A blue)
          )))



