package com.aditya.imscbit.maths

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.aditya.imscbit.R
import com.aditya.imscbit.physics.Syllabus
val modules31= arrayOf("Formation of partial differential equations, definition and examples of linear and non-linear partial differential equations, order and degree of partial differential equations, linear partial differential equation of first order, equation solvable by direct integration, Lagrange’s method, integral surfaces passing through a given curve, surfaces orthogonal to a given system of surfaces, and Cauchy's problem for first order partial differential equations.",
    "Non-linear partial differential equations, compatible system of first order equations, Charpit's and Jacobi's methods, Cauchy’s method of characteristics, Higher order linear homogenous and non-homogenous partial differential equations with constant coefficients. Classification and canonical transformation of second order linear partial differential equations.",
    "Method of separation of variables for linear partial differential equations, Hyperbolic Equations: D’Alembert’s solution, vibrations of an infinite string and a semi-infinite string. Vibrations of string of finite length (separation method).",
    "Parabolic Equations: Solution of heat equation (separation method), heat conduction problem for an infinite rod, a finite rod, Duhamel’s principle for parabolic equations.",
    "Elliptic Equations: Boundary value problems: Dirichlet, Neumann, Cauchy boundary conditions. Maximum and minimum principles, Dirichlet and Neumann problems for a rectangle (separation method), and theory of Green’s function for Laplace equation.")
val refbooks31= arrayOf(
    "1. I. N. Sneddon: Elements of Partial Differential Equations, McGraw-Hill\n" +
            "2. T. Amaranath: An Elementary Course in Partial differential equations, Narosa Publishing House\n" +
            "3. S. L. Ross: Differential Equations, Wiley\n" +
            "4. K. Sankara Rao: Introduction to Partial Differential Equations, PHI Learning",
    "1. M.D. Raisinghania: Advanced Differential Equations, S. Chand & Co.\n" +
            "2. Walter A. Strauss: An Introduction to Partial Differential Equation, Wiley")
val modules32= arrayOf("Primes, infinitude of primes, fundamental theorem of arithmetic, congruence a x \uF0BA b ( mod n ) , Chinese\n" +
        "remainder theorem, partition of integers, Euler \uF066 -function, \uF074 -function, Mobius inversion formula.",
    "Binary operations, introduction to groups (Symmetric group, Quaternion group, Dihedral group),\n" +
            "permutation groups, subgroups, cyclic groups, cosets and Lagrange’s theorem, normal subgroup, quotient\n" +
            "groups, simple group. homomorphism’s and isomorphism’s of groups, Cayley’s theorem, correspondence\n" +
            "theorem and its corollary, direct products of groups.",
    "Conjugacy classes, Cauchy’s theorem and p-groups, Sylow’s theorems and application. Finitely generated\n" +
            "Abelian groups, fundamental theorem of finitely generated abelian group, invariant factors, elementary\n" +
            "divisors.",
    "Introduction to rings, integral domain and field. Sub rings and ideals intersection, union and sums of\n" +
            "ideals, generating set of an ideal. Nilpotent ideal, Ring Homomorphism and fundamental theorem. Factor\n" +
            "rings, prime ideal and maximum ideals. Basic theorems of isomorphism, embedding of field of quotients\n" +
            "of an integral domain.",
    "Polynomial Rings, division Algorithm of R[x], where R is commutative ring with unity. Divisibility in\n" +
            "Integral Domains, prime and irreducible elements. Concept and results about PID, ED and UFD.\n" +
            "Reducibility tests, irreducibility test, UFD in Z[x]).")
val refbooks32= arrayOf(
    "1. J.B. Fralieigh: A first Course in Abstract Algebra, Addison-Wesley\n" +
            "2. Joseph A.Gallian: Contemporary Abstract Algebra, Narosa Publishing House\n" +
            "3. I. N. Herstein: Topics in Algebra, Wiley\n" +
            "4. M. Artin: Algebra, Prentice Hall of India",
    "1. S.K. Mapa: Higher Algebra (Linear and Modern), Levant Publisher\n" +
            "2. V. K. Khanna & S.K. Bhambri: A Course in Abstract Algebra, Vikas Publishing House\n" +
            "3. A.K. Vasishtha & A.R. Vasishtha: Modern Algebra, Krishna Prakashan Media\n" +
            "4. Surjeet Singh & Qazi Zameeruddin: Modern Algebra, Vikas Publishing House")
val modules33= arrayOf("Periodic Functions, Euler’s formula, Dirichlet’s conditions, Fourier series of functions with arbitrary\n" +
        "period, expansion of even and odd functions, Half- range series, Parseval’s formula, complex form of\n" +
        "Fourier series.",
    "Laplace Transform: Definition, linearity property, sufficient conditions for existence of Laplace\n" +
            "transform, shifting properties, Laplace transform of derivatives, integrals, unit step functions, Dirac deltafunction,\n" +
            "impulse and periodic function.\n" +
            "Inverse Laplace transforms convolution theorem and inversion formula. Application of Laplace transform\n" +
            "for solving ODEs, PDEs (Hyperbolic and parabolic types) and integral equations.",
    "Fourier Transform: Fourier Integral formula, Fourier Transform, Fourier sine and cosine transforms.\n" +
            "Linearity, Scaling, frequency shifting and time shifting properties. Self-reciprocity of Fourier transform,\n" +
            "convolution theorem. Application for solving PDEs (Hyperbolic and parabolic types).",
    "Henkel Transform: Definition and elementary properties: inversion theorem, Henkel transforms of\n" +
            "derivatives, Parseval’s theorem. Application for solving boundary value problems, and partial differential\n" +
            "equations.",
    "Z-Transform: Linear difference equations, Fibonacci relation, basic theory of Z-Transforms, Existence of\n" +
            "Z-Transforms, Linearity property, translation and shifting theorems, scaling properties, convolution\n" +
            "theorem, inverse of Z -Transform, solution of difference equations using Z -Transform.")
val refbooks33= arrayOf(
    "1. I.N Sneddon: The use of integral Transforms, McGraw-Hill\n" +
            "2. K. Sankara Rao: Introduction to Partial Differential Equations, PHI Learning\n" +
            "3. B. V. Ramana: Higher Engineering Mathematics, McGraw Hill\n" +
            "4. R.K Jain, S.R.K Iyengar: Advanced Engineering Mathematics, Narosa Publication\n" +
            "5. R.S. Pathak: The wavelet Transform, Atlantis Press",
    "1. M.D. Raisinghania: Advanced Differential Equations, S. Chand & Co\n" +
            "2. Vasishtha & Gupta: Integral Transforms, Krishna Prakashan, Meerut")
val modules34= arrayOf("",
    "",
    "",
    "",
    "")
val refbooks34= arrayOf(
    "",
    "")
val modules35= arrayOf("",
    "",
    "",
    "",
    "")
val refbooks35= arrayOf(
    "",
    "")

class maths_sem_3 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.maths_sem_3, container, false)
        val button1 = view.findViewById<Button>(R.id.msem3_sub1)
        val button2 = view.findViewById<Button>(R.id.msem3_sub2)
        val button4 = view.findViewById<Button>(R.id.msem3_sub4)
        val button3 = view.findViewById<Button>(R.id.msem3_sub3)
        val button5=view.findViewById<Button>(R.id.msem3_sub5)

        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules31)
            intent.putExtra("books", refbooks31)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules32)
            intent.putExtra("books", refbooks32)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules34)
            intent.putExtra("books", refbooks34)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules33)
            intent.putExtra("books", refbooks33)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules35)
            intent.putExtra("books", refbooks35)
            startActivity(intent)
        }

        return view
    }

    companion object {

        fun newInstance(): maths_sem_3 =
            maths_sem_3()
    }
}