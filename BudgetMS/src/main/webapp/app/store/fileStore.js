Ext.define('BudgetMS.store.fileStore', {
	name : 'file',
	extend : 'BudgetMS.store.baseStore',
	model : 'BudgetMS.model.file',
	// proxy : {
	// type : 'ajax',
	// url : 'attach/getAttachByIdType.do',
	// reader : {
	// type : 'json',
	// root:'record',
	// totalProperty:'total'
	// }
	// }
	data : [ {
		atchId : '1',
		atchName : 'QSBH001',
		recordId : 'QSBH001',
		url : '#',
		atch_type : '',
		remark : ''
	} ]
});

// fields:'',
