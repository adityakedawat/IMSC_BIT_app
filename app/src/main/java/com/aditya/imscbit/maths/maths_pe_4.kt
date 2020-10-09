package com.aditya.imscbit.maths

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aditya.imscbit.R
import com.aditya.imscbit.physics.Syllabus
val modulespe41= arrayOf("Basic Fourier analysis, inner products and orthogonal projections, discrete and fast Fourier transforms, Fourier series for periodic functions ",
    "Fourier transform, convolution and inversion of Fourier transform different features of Fourier transform, Fourier transforms with several variables, Shannon’s sampling theorem, Heisenberg’s uncertainty principle.",
    "Isometric isomorphism between and [0, 2], Basic wavelets (Haar/Shannon/Daubechies), continuous wavelet transform, discrete wavelet transform, integral wavelet, orthogonal wavelets, multi-resolution analysis, reconstruction of wavelets and applications. ",
    "Haar’s simple wavelets, simple approximation, approximation with simple wavelet. Ordered fast Haar wavelet transform, in-place fast Haar wavelet transform, in-place fast inverse Haar wavelet transform",
    "Two dimensional wavelets, two dimensional approximations with step functions, two dimensional fast Haar wavelet transform applications of wavelets ")
val refbookspe41= arrayOf(
    "1. Y. Nievergelt: Wavelets Made Easy, Birkhauser, Boston, 1999 \n" +
            "2. R. S Pathak:The wavelet transform, Atlantis Press \n" +
            "3. Bachman, G. Narici, L., Beckenstein, E.: Fourier and Wavelet Analysis, Springer, 2005 \n" +
            "4. Koorniwinder, T.H., Wavelet: An Elementary Treatment of Theory and Applications, World \n",
    "1. R.M. Rao and A.S. Bopardikar:Wavelet Transforms: Introduction to theory and applications, \n" +
            "\n" +
            "Adison Wesley \n" +
            "2. C.K. Chui: An Introduction to Wavelets, Academic Press 1992 \n" +
            "3. Chan, A. K., Peng C.: Wavelets for Sensing Technology, Artech House 2003 \n" +
            "4. Daubechies, I.: Ten Lectures in Wavelets, SIAM 1992\n")
val modulespe42= arrayOf("Introduction of Neural Networks and Human Brain, Biological and Artificial Neuron, Models of a Neuron, Different types of Activation functions, Perceptron Model, Adaline Model, Neural Networks viewed as Directed Graphs, Network Architectures, characteristics of Neural Networks.",
    "Learning Processes: Error-Correction Learning, Memory–Based Learning, Hebbian Learning, Competitive learning, Boltzmann Learning, Learning with a teacher (supervised),Learning without a teacher (unsupervised).Learning Tasks: Pattern Association, Pattern Recognition and Function Association.",
    "Single Layer Perceptron: Introduction, Unconstrained Optimization Techniques: Method of Steepest Descent, Newton’s Method, Gauss Newton Method, Least Mean Square Algorithm. Perceptron, Perceptron Convergence Theorem (Statement only). Multiple Layer Perceptron: Back-Propagation Algorithm, XOR Problem. \n" +
            "ART1: Architecture of ART1, Special Features of ART1 Models and ART1 Algorithm, ART2: Architecture of ART2, ART2 Algorithm. \n",
    "Bidirectional Associative Memory(BAM), Radial Basis Function Networks: Cover’s \n" +
            "theorem on the seperability of patterns, Separating Capacity of a surface, Interpolation Problem, Micchelli’s theorem. Neurodynamical Models: Additive Model, Hopfield Model, Relation between the Stable States of the Discrete and Continuous versions of the Hopfield Model. The Discrete Hopfield Model as a Content-Addressable Memory. Brain –State-In-A-Box Model, Lyapunov Function of the BSB Model, Dynamics of the BSB model.\n",
    "Principal Component Analysis: Introduction, Some intuitive Principles of Self-Organization, Principal Component Analysis. Self-Organizing Maps: Introduction, Two Basic Feature-Mapping Models, Self-Organizing Map, Properties of the Feature Map. ")
val refbookspe42= arrayOf(
    "1. Haykin Simon, Neural network, Addison Wesley Longman Pvt. Ltd, Delhi.",
    "1. Jacek M. Zurada, Introduction to Artificial Neural Systems, Jaico Publishing House. \n" +
            "2. Rajasekaran and Pai G.A. V. Neural Networks, Fuzzy logic and Genetic Algorithm, Prentice Hall of India. \n" +
            "3. Laurence Faucett, Fundamentals of Neural Networks, Architectures, Algorithms and Applications.\n")
val modulespe43= arrayOf("Introduction: Essentials, Benefits and need for Cloud Computing - Business and IT Perspective - Cloud and Virtualization - Cloud Services Requirements - Cloud and Dynamic Infrastructure - Cloud Computing Characteristics Cloud Adoption.",
    "Principles of Parallel and Distributed Computing: Eras of computing, Parallel vs. Distributed computing, Elements of parallel computing, Elements of distributed computing, Technologies for distributed computing",
    "Virtualization: Introduction, Characteristics of virtualized environments, Taxonomy of virtualization techniques, Virtualization and cloud computing, Pros and cons of virtualization, Technology examples. \n" +
            "Storage virtualization:Storage Area Networks - Network-Attached storage - Cloud Server Virtualization - Virtualized Data Centre. \n",
    "Cloud computing architecture: Introduction, Cloud reference model, Types of clouds, Economics of the cloud, Open challenges",
    "Cloud platforms in industry and Cloud applications :Amazon web services, Google app engine, Microsoft azure, Observations, Scientific applications, Scientific, Business and Consumer applications")
val refbookspe43= arrayOf(
    "1. Buyya Raj Kumar, Vecchiola Christian & Thamarai S. Selvi, “Mastering Cloud Computing”, McGraw Hill Publication, New Delhi, 2013. ",
    "1. Velte T., Velte A. and Elsenpeter R., “Cloud Computing: A Practical Approach”, McGraw Hill, India. \n" +
            "2. Buyya R., Broberg J., “Cloud Computing: Principles and Paradigms”, Wiley. \n" +
            "3. Hwang K., Fox G. and Dongarra J., “Distributed and Cloud Computing, From Parallel Processing to the Internet of Things”, Morgan Kaufmann, 2012.\n")
val modulespe44= arrayOf("Database Design and Entity- Relational Model \n" +
        "Introduction to Data and Database Management, The Database Life Cycle, Conceptual Data Modeling, Fundamental ER Constructs, Mapping Cardinalities and Constraints, Relational Data model (Relational Algebra, Tuple and Domain Relational Calculus), Network Model, Hierarchical Model, Alternative Conceptual Data Modeling Notations, Advanced ER Construct, Summary.\n",
    "Requirement Analysis and Conceptual Data Modeling \n" +
            "Introduction, Requirements Analysis, Conceptual Data Modeling, View Integration, Entity Clustering for ER Models, Transforming Rules and SQL Constructs, Transformation Steps, Summary. \n",
    "The Unified Modeling Language (UML) and Normalization \n" +
            "Class Diagrams, Activity Diagrams, Rules of Thumb for UML Usage, Functional Dependencies, Fundamentals of Normalization, Design of Normalized Tables, Normalization of Candidate Tables Derived from ER Diagrams, 1NF, 2NF, 3NF, BCNF, Fourth and Fifth Normal Forms. Determining the Minimum set of 3NF Tables, Summary. \n",
    "Business Intelligence \n" +
            "Overview of Data Warehousing, Logical Design, The Exponential Explosion of views, Decision Support system. Overview of Online Analytical Processing (OLAP), View Size Estimation, Selection of Materialized Views, View Maintenance, Query Optimization, Forecasting, Overview of Data mining and Text Mining, Summary.\n",
    "Logical Database Design \n" +
            "Requirements Specification, Logical Design, CASE Tools for Logical Database Design, generating a Database from a Design, Database Support, Collaborative Support, Distributed Development, Application Life Cycle tooling Integration, Design Compliance Checking, Reporting, Modeling a Data Warehouse, Semi-Structured Data, XML, Summary. \n")
val refbookspe44= arrayOf(
    "1. Teorey ,T. J., Lightstone,S., and Nadeau ,T.,”Database Modeling and Design: Logical Design”, Fourth Edition, Morgan Kaufmann Publishers, 2006 ",
    "1. Elmasri,R., and Navathe ,S.B.,”Fundamentals of Database Systems,”Sixth Edition,Pearson,2015. \n" +
            "2. Silberschatz ,A., Korth ,H. F., and Sudarshan ,S.,”Database System Concepts,” Sixth Edition, Mc Graw Hill Education,2010. \n")
val modulespe45= arrayOf("Introduction: System Software & its Components, Evolution of System Softwares- Operating\n" +
        "System, Loaders, Interpreters, Compilers, Linkers, Assemblers.\n" +
        "Assemblers: Elements of Assembly Language Programming, Assembly Process, Single Pass\n" +
        "Assembler, Design of a 2-Pass assembler for In 8088.\n",
    "Macros & Macro processors: Macros, Different forms of Macros, Macros using AIF, AGO,\n" +
            "REPT. Etc, Design of a Macro Processor, Macro Assembler.\n",
    "Loaders: Basic Loader Functions, Absolute Loader, Compile & go Loader, Relocating Loader,\n" +
            "Direct Linking Loader. \n",
    "Linkage Editors: Linking and Relocation, Program Reliability, Linkage Editor and its\n" +
            "Application in IBM-PC, Linking for Program Overlays. \n",
    "Software Tools: Spectrum of Software Tools, Text Editors, Interpreter and Program Generators,\n" +
            "Debug Monitors, Programming Environments. \n")
val refbookspe45= arrayOf(
    "Dhamdhere D.M., ”System Programming and Operating Systems”, 2nd Edition., TMH, New\n" +
            "Delhi.(T1)\n",
    "Donovon J.J., “ System Programming”, TMH, New Delhi.(R1)\n" +
            "Beck Leland L., “System Software – An Introduction to Systems Programming”, 3rd\n" +
            "\n" +
            "Edition, Pearson Education Asia, 2000. (R2)\n" +
            "Chattopadhyay Santanu, “System Software”, Prentice-Hall India, 2007. (R3)\n")


class maths_pe_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths_pe_4)
        val button1 = findViewById<Button>(R.id.maths_pe4_sub1)
        val button2 = findViewById<Button>(R.id.maths_pe4_sub2)
        val button3 = findViewById<Button>(R.id.maths_pe4_sub3)
        val button4 = findViewById<Button>(R.id.maths_pe4_sub4)
        val button5 = findViewById<Button>(R.id.maths_pe4_sub5)
        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe41)
            intent.putExtra("books", refbookspe41)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe42)
            intent.putExtra("books", refbookspe42)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe43)
            intent.putExtra("books", refbookspe43)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe44)
            intent.putExtra("books", refbookspe44)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe45)
            intent.putExtra("books", refbookspe45)
            startActivity(intent)
        }
    }
}