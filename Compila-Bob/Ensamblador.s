	.file	"cCode.cpp"
	.section .rdata,"dr"
__ZStL19piecewise_construct:
	.space 1
.lcomm __ZStL8__ioinit,1,1
	.def	___main;	.scl	2;	.type	32;	.endef
LC0:
	.ascii "Escribe 5 numeros enteros\0"
LC1:
	.ascii "Mayor: \0"
LC2:
	.ascii "Menor: \0"
LC3:
	.ascii "Suma: \0"
LC4:
	.ascii "Resta: \0"
LC5:
	.ascii "Multiplicacion: \0"
LC6:
	.ascii ".- \0"
LC7:
	.ascii ", \0"
	.text
	.globl	_main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
LFB1445:
	.cfi_startproc
	leal	4(%esp), %ecx
	.cfi_def_cfa 1, 0
	andl	$-16, %esp
	pushl	-4(%ecx)
	pushl	%ebp
	.cfi_escape 0x10,0x5,0x2,0x75,0
	movl	%esp, %ebp
	pushl	%edi
	pushl	%esi
	pushl	%ebx
	pushl	%ecx
	.cfi_escape 0xf,0x3,0x75,0x70,0x6
	.cfi_escape 0x10,0x7,0x2,0x75,0x7c
	.cfi_escape 0x10,0x6,0x2,0x75,0x78
	.cfi_escape 0x10,0x3,0x2,0x75,0x74
	subl	$88, %esp
	call	___main
	movl	$0, -28(%ebp)
	movl	$LC0, 4(%esp)
	movl	$__ZSt4cout, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	$__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEPFRSoS_E
	subl	$4, %esp
	leal	-48(%ebp), %eax
	movl	%eax, (%esp)
	movl	$__ZSt3cin, %ecx
	call	__ZNSirsERi
	subl	$4, %esp
	leal	-52(%ebp), %eax
	movl	%eax, (%esp)
	movl	$__ZSt3cin, %ecx
	call	__ZNSirsERi
	subl	$4, %esp
	leal	-56(%ebp), %eax
	movl	%eax, (%esp)
	movl	$__ZSt3cin, %ecx
	call	__ZNSirsERi
	subl	$4, %esp
	leal	-60(%ebp), %eax
	movl	%eax, (%esp)
	movl	$__ZSt3cin, %ecx
	call	__ZNSirsERi
	subl	$4, %esp
	leal	-64(%ebp), %eax
	movl	%eax, (%esp)
	movl	$__ZSt3cin, %ecx
	call	__ZNSirsERi
	subl	$4, %esp
L12:
	movl	-48(%ebp), %edx
	movl	-52(%ebp), %eax
	cmpl	%eax, %edx
	jle	L2
	movl	-48(%ebp), %eax
	movl	%eax, -32(%ebp)
	movl	-52(%ebp), %eax
	movl	%eax, -48(%ebp)
	movl	-32(%ebp), %eax
	movl	%eax, -52(%ebp)
	jmp	L3
L2:
	movl	-52(%ebp), %edx
	movl	-56(%ebp), %eax
	cmpl	%eax, %edx
	jle	L4
	movl	-52(%ebp), %eax
	movl	%eax, -32(%ebp)
	movl	-56(%ebp), %eax
	movl	%eax, -52(%ebp)
	movl	-32(%ebp), %eax
	movl	%eax, -56(%ebp)
	jmp	L3
L4:
	movl	-56(%ebp), %edx
	movl	-60(%ebp), %eax
	cmpl	%eax, %edx
	jle	L5
	movl	-56(%ebp), %eax
	movl	%eax, -32(%ebp)
	movl	-60(%ebp), %eax
	movl	%eax, -56(%ebp)
	movl	-32(%ebp), %eax
	movl	%eax, -60(%ebp)
	jmp	L3
L5:
	movl	-60(%ebp), %edx
	movl	-64(%ebp), %eax
	cmpl	%eax, %edx
	jle	L6
	movl	-60(%ebp), %eax
	movl	%eax, -32(%ebp)
	movl	-64(%ebp), %eax
	movl	%eax, -60(%ebp)
	movl	-32(%ebp), %eax
	movl	%eax, -64(%ebp)
L6:
	movl	-64(%ebp), %edx
	movl	-60(%ebp), %eax
	cmpl	%eax, %edx
	jge	L7
	movl	-64(%ebp), %eax
	movl	%eax, -32(%ebp)
	movl	-60(%ebp), %eax
	movl	%eax, -64(%ebp)
	movl	-32(%ebp), %eax
	movl	%eax, -60(%ebp)
	jmp	L3
L7:
	movl	-60(%ebp), %edx
	movl	-56(%ebp), %eax
	cmpl	%eax, %edx
	jge	L8
	movl	-60(%ebp), %eax
	movl	%eax, -32(%ebp)
	movl	-56(%ebp), %eax
	movl	%eax, -60(%ebp)
	movl	-32(%ebp), %eax
	movl	%eax, -56(%ebp)
	jmp	L3
L8:
	movl	-56(%ebp), %edx
	movl	-52(%ebp), %eax
	cmpl	%eax, %edx
	jge	L9
	movl	-56(%ebp), %eax
	movl	%eax, -32(%ebp)
	movl	-52(%ebp), %eax
	movl	%eax, -56(%ebp)
	movl	-32(%ebp), %eax
	movl	%eax, -52(%ebp)
	jmp	L3
L9:
	movl	-52(%ebp), %edx
	movl	-48(%ebp), %eax
	cmpl	%eax, %edx
	jge	L10
	movl	-52(%ebp), %eax
	movl	%eax, -32(%ebp)
	movl	-48(%ebp), %eax
	movl	%eax, -52(%ebp)
	movl	-32(%ebp), %eax
	movl	%eax, -48(%ebp)
	movl	$1, -28(%ebp)
	jmp	L3
L10:
	movl	$1, -28(%ebp)
L3:
	cmpl	$0, -28(%ebp)
	jne	L11
	jmp	L12
L11:
	movl	-64(%ebp), %ebx
	movl	-60(%ebp), %esi
	movl	-56(%ebp), %edi
	movl	-52(%ebp), %eax
	movl	%eax, -76(%ebp)
	movl	-48(%ebp), %eax
	movl	%eax, (%esp)
	movl	$__ZSt4cout, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	-76(%ebp), %ecx
	movl	%ecx, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	%edi, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	%esi, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	%ebx, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEPFRSoS_E
	subl	$4, %esp
	movl	-64(%ebp), %ebx
	movl	$LC1, 4(%esp)
	movl	$__ZSt4cout, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%ebx, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEPFRSoS_E
	subl	$4, %esp
	movl	-48(%ebp), %ebx
	movl	$LC2, 4(%esp)
	movl	$__ZSt4cout, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%ebx, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEPFRSoS_E
	subl	$4, %esp
	movl	-64(%ebp), %edx
	movl	-48(%ebp), %eax
	addl	%edx, %eax
	movl	%eax, -36(%ebp)
	movl	-64(%ebp), %edx
	movl	-48(%ebp), %eax
	subl	%eax, %edx
	movl	%edx, %eax
	movl	%eax, -40(%ebp)
	movl	-64(%ebp), %edx
	movl	-48(%ebp), %eax
	imull	%edx, %eax
	movl	%eax, -44(%ebp)
	movl	$LC3, 4(%esp)
	movl	$__ZSt4cout, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%eax, %edx
	movl	-36(%ebp), %eax
	movl	%eax, (%esp)
	movl	%edx, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEPFRSoS_E
	subl	$4, %esp
	movl	$LC4, 4(%esp)
	movl	$__ZSt4cout, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%eax, %edx
	movl	-40(%ebp), %eax
	movl	%eax, (%esp)
	movl	%edx, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEPFRSoS_E
	subl	$4, %esp
	movl	$LC5, 4(%esp)
	movl	$__ZSt4cout, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%eax, %edx
	movl	-44(%ebp), %eax
	movl	%eax, (%esp)
	movl	%edx, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEPFRSoS_E
	subl	$4, %esp
L14:
	movl	-60(%ebp), %ebx
	movl	-56(%ebp), %esi
	movl	-52(%ebp), %edi
	movl	-28(%ebp), %eax
	movl	%eax, (%esp)
	movl	$__ZSt4cout, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$LC6, 4(%esp)
	movl	%eax, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%edi, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$LC7, 4(%esp)
	movl	%eax, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%esi, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$LC7, 4(%esp)
	movl	%eax, (%esp)
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%ebx, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEi
	subl	$4, %esp
	movl	$__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, (%esp)
	movl	%eax, %ecx
	call	__ZNSolsEPFRSoS_E
	subl	$4, %esp
	addl	$1, -28(%ebp)
	cmpl	$19, -28(%ebp)
	jg	L13
	jmp	L14
L13:
	movl	$0, %eax
	leal	-16(%ebp), %esp
	popl	%ecx
	.cfi_restore 1
	.cfi_def_cfa 1, 0
	popl	%ebx
	.cfi_restore 3
	popl	%esi
	.cfi_restore 6
	popl	%edi
	.cfi_restore 7
	popl	%ebp
	.cfi_restore 5
	leal	-4(%ecx), %esp
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE1445:
	.def	___tcf_0;	.scl	3;	.type	32;	.endef
___tcf_0:
LFB1878:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$8, %esp
	movl	$__ZStL8__ioinit, %ecx
	call	__ZNSt8ios_base4InitD1Ev
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE1878:
	.def	__Z41__static_initialization_and_destruction_0ii;	.scl	3;	.type	32;	.endef
__Z41__static_initialization_and_destruction_0ii:
LFB1877:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$24, %esp
	cmpl	$1, 8(%ebp)
	jne	L19
	cmpl	$65535, 12(%ebp)
	jne	L19
	movl	$__ZStL8__ioinit, %ecx
	call	__ZNSt8ios_base4InitC1Ev
	movl	$___tcf_0, (%esp)
	call	_atexit
L19:
	nop
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE1877:
	.def	__GLOBAL__sub_I_main;	.scl	3;	.type	32;	.endef
__GLOBAL__sub_I_main:
LFB1879:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$24, %esp
	movl	$65535, 4(%esp)
	movl	$1, (%esp)
	call	__Z41__static_initialization_and_destruction_0ii
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE1879:
	.section	.ctors,"w"
	.align 4
	.long	__GLOBAL__sub_I_main
	.ident	"GCC: (MinGW.org GCC-6.3.0-1) 6.3.0"
	.def	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;	.scl	2;	.type	32;	.endef
	.def	__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_;	.scl	2;	.type	32;	.endef
	.def	__ZNSolsEPFRSoS_E;	.scl	2;	.type	32;	.endef
	.def	__ZNSirsERi;	.scl	2;	.type	32;	.endef
	.def	__ZNSolsEi;	.scl	2;	.type	32;	.endef
	.def	__ZNSt8ios_base4InitD1Ev;	.scl	2;	.type	32;	.endef
	.def	__ZNSt8ios_base4InitC1Ev;	.scl	2;	.type	32;	.endef
	.def	_atexit;	.scl	2;	.type	32;	.endef
