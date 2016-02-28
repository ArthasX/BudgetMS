var instFields=[ {
	name : "instId",
	type : "auto"
}, {
	name : 'instTitle',
	type : 'auto'
}, {
	name : 'instContent',
	type : 'auto'
}, {
	name : 'instType',
	type : 'int'
}, {
	name : 'instStatus',
	type : 'auto'
},{
	name : 'applyDept',
	type : 'int'
}, {
	name : 'instAmt',
	type : 'float',
}, {
	name : 'softAmt',
	type : 'float'
}, {
	name : 'hardAmt',
	type : 'float'
}, {
	name : 'applyUser',
	type : 'int'
}, {
	name : 'applyUserName',
	type : 'auto'
}, {
	name : 'optDate',
	type : 'auto'
}, {
	name : 'optUser',
	type : 'auto'
}, {
	name : 'remark',
	type : 'auto'
} ];


Ext.define("BudgetMS.model.inst", {
	extend : "Ext.data.Model",
	fields : instFields
});
