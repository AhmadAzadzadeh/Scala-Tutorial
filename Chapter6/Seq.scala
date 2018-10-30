// Sequence is a trait and if you look carefully in the console window for Step 1 above, the elements of the Sequence were rendered
// into a concrete Immutable List.
val seq1: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Chocolate Donut")

println(seq1)

println(seq1(0))
println(seq1(1))
println(seq1(2))

val emptySeq: Seq[String] = Seq.empty[String]
println(emptySeq)