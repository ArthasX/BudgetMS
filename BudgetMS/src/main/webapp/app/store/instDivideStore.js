Ext.define('BudgetMS.store.instDivideStore', {
	name : 'instDivide',
	model : 'BudgetMS.model.instDivide',
	proxy : {
		type : 'ajax',
		url : 'inst/findInstDivideByInstId.do',
		reader : {
			type : 'json',
		}
	}
});

// fields:'',
